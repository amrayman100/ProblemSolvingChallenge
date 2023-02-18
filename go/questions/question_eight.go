package questions

// IndexOfFirstDuplicate Runtime Complexity O(N) Space Complexity O(N)
func IndexOfFirstDuplicate(numbers []int) int {
	numberMap := make(map[int]bool)
	for index, number := range numbers {
		if _, ok := numberMap[number]; ok {
			return index
		} else {
			numberMap[number] = true
		}
	}
	return -1
}
