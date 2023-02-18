package test

import (
	"challenge/questions"
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestIndexOfFirstDuplicateIfDuplicateExists(t *testing.T) {
	assert.Equal(t, 3, questions.IndexOfFirstDuplicate([]int{5, 17, 3, 17, 4, -1, 4}))
}

func TestIndexOfFirstDuplicateIfDuplicateDoesNotExist(t *testing.T) {
	assert.Equal(t, -1, questions.IndexOfFirstDuplicate([]int{5, 17, 3}))
}
