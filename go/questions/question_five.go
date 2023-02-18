package questions

func Unique(s []string) []string {
	wordMap := make(map[string]int)
	var result []string

	for _, character := range s {
		var currentCount int
		if v, ok := wordMap[character]; ok {
			currentCount = v + 1
		} else {
			currentCount = 1
		}
		wordMap[character] = currentCount
	}

	for key, count := range wordMap {
		if count == 1 {
			result = append(result, key)
		}
	}

	return result
}
