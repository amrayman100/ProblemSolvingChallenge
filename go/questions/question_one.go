package questions

import (
	"unicode"
)

// Palindrome This function handles the scenario if the input is a phrase and a palindrome such as A man, a plan, a canal – Panama //
func Palindrome(s string) bool {
	left := 0
	right := len(s) - 1
	for right > left {
		if isAlphaNumeric(s[left]) == false {
			left++
			continue
		}
		if isAlphaNumeric(s[right]) == false {
			right--
			continue
		}
		if toLowerCase(s[left]) != toLowerCase(s[right]) {
			return false
		}
		left++
		right--
	}

	return true
}

func isAlphaNumeric(c byte) bool {
	return (unicode.IsLetter(rune(c)) || unicode.IsNumber(rune(c))) && (rune(c) != 226)
}

func toLowerCase(c byte) rune {
	return unicode.ToLower(rune(c))
}
