package test

import (
	"challenge/questions"
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestInputIsPalindrome(t *testing.T) {
	assert.Equal(t, true, questions.Palindrome("anna"))
	assert.Equal(t, true, questions.Palindrome("xhx"))
	assert.Equal(t, true, questions.Palindrome("A man, a plan, a canal – Panama"))
	assert.Equal(t, true, questions.Palindrome("no lemon, no melon"))
	assert.Equal(t, true, questions.Palindrome("taco cat"))
	assert.Equal(t, true, questions.Palindrome("never odd or even"))

}

func TestInputIsNotPalindrome(t *testing.T) {
	assert.Equal(t, false, questions.Palindrome("amber"))
	assert.Equal(t, false, questions.Palindrome("xyaytaaa"))
	assert.Equal(t, false, questions.Palindrome("bbttTTT"))
}
