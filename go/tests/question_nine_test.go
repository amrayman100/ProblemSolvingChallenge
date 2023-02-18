package test

import (
	"challenge/questions"
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestSumTree(t *testing.T) {
	sum, root := prepareTestData()
	assert.Equal(t, sum, questions.Sum(root))
}

func prepareTestData() (int, questions.Node) {
	sumOfNodes := 0
	n11 := questions.Node{Val: 3}
	sumOfNodes += n11.Val
	n12 := questions.Node{Val: 3}
	sumOfNodes += n12.Val
	n13 := questions.Node{Val: 3}
	sumOfNodes += n13.Val
	n21 := questions.Node{Val: 3}
	sumOfNodes += n21.Val
	n22 := questions.Node{Val: 3}
	sumOfNodes += n22.Val
	n23 := questions.Node{Val: 3}
	sumOfNodes += n23.Val
	n1 := questions.Node{Val: 3, Children: []questions.Node{n11, n12, n13}}
	n2 := questions.Node{Val: 3, Children: []questions.Node{n21, n22, n23}}
	sumOfNodes += n1.Val
	sumOfNodes += n2.Val
	root := questions.Node{Val: 2, Children: []questions.Node{n1, n2}}
	sumOfNodes += root.Val
	return sumOfNodes, root
}
