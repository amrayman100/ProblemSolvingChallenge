package test

import (
	"challenge/questions"
	"github.com/stretchr/testify/assert"
	"sort"
	"testing"
)

func TestUnique(t *testing.T) {
	actual := questions.Unique([]string{"apples", "oranges", "flowers", "apples"})
	expected := []string{"oranges", "flowers"}
	sort.Strings(actual)
	sort.Strings(expected)
	assert.Equal(t, expected, actual)
	assert.Equal(t, []string(nil), questions.Unique([]string{"apples", "apples"}))
}
