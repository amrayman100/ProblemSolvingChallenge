package test

import (
	"challenge/questions"
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestComposition(t *testing.T) {
	assert.Equal(t, 49, questions.H(6))
	assert.Equal(t, 4, questions.H(1))
	assert.Equal(t, 9, questions.H(2))
}
