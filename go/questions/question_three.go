package questions

import (
	"strconv"
	"unicode"
)

func RunLengthEncode(s string) string {
	encodedString := ""
	count := 1
	for i := 0; i < len(s); i++ {
		str := string(s[i])
		if i < len(s)-1 && s[i] == s[i+1] {
			count++
		} else {
			encodedString += str + strconv.Itoa(count)
			count = 1
		}
	}
	return encodedString
}

func RunLengthDecode(s string) string {
	decodedString := ""
	countString := ""
	left := 0
	right := 1

	for right < len(s) {
		if unicode.IsLetter(rune(s[right])) == false {
			countString += string(s[right])
			right++
		}
		if right == len(s) || unicode.IsLetter(rune(s[right])) {
			var count int
			if countString == "" {
				count = 1
			} else {
				count, _ = strconv.Atoi(countString)
			}
			decodedString = populateString(decodedString, string(s[left]), count)
			countString = ""
			left = right
			right++
		}
	}
	return decodedString
}

func populateString(stringToPopulate string, repeatedChar string, count int) string {
	for i := 0; i < count; i++ {
		stringToPopulate += repeatedChar
	}
	return stringToPopulate
}
