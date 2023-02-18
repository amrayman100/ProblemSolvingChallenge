package test

import (
	"challenge/questions"
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestTransposeTwoByTwo(t *testing.T) {
	assert.Equal(t, [][]int{{1, 3}, {2, 4}}, questions.Transpose([][]int{{1, 2}, {3, 4}}))
}

func TestTransposeFourByFour(t *testing.T) {
	assert.Equal(t, [][]int{{1, 2, 3, 4}, {5, 6, 7, 8}}, questions.Transpose([][]int{{1, 5}, {2, 6}, {3, 7}, {4, 8}}))
}
