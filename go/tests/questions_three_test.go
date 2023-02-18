package test

import (
	questions "challenge/questions"
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestRunLengthEncode(t *testing.T) {
	assert.Equal(t, questions.RunLengthEncode("aaaaaaaaaabbbaxxxxyyyzyx"), "a10b3a1x4y3z1y1x1")
	assert.Equal(t, questions.RunLengthEncode("aaa"), "a3")
	assert.Equal(t, questions.RunLengthEncode("aaabbxx"), "a3b2x2")
	assert.Equal(t, questions.RunLengthEncode("a"), "a1")
	assert.Equal(t, questions.RunLengthEncode("abc"), "a1b1c1")
	assert.Equal(t, questions.RunLengthEncode("abcaaa"), "a1b1c1a3")
}

func TestRunLengthDecode(t *testing.T) {
	assert.Equal(t, questions.RunLengthDecode("a10b3a1x4y3z1y1x1"), "aaaaaaaaaabbbaxxxxyyyzyx")
	assert.Equal(t, questions.RunLengthDecode("a3"), "aaa")
	assert.Equal(t, questions.RunLengthDecode("a3b2x2"), "aaabbxx")
	assert.Equal(t, questions.RunLengthDecode("a1"), "a")
	assert.Equal(t, questions.RunLengthDecode("a1b1c1"), "abc")
	assert.Equal(t, questions.RunLengthDecode("a1b1c1a3"), "abcaaa")
}
