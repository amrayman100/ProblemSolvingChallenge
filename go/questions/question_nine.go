package questions

import (
	"container/list"
)

type Node struct {
	Val      int
	Children []Node
}

// Sum Breadth First Search approach //
func Sum(root Node) int {
	sum := 0
	queue := list.New()
	queue.PushBack(root)
	for queue.Len() > 0 {
		size := queue.Len()
		for i := 0; i < size; i++ {
			node := getNodeFromQueueElement(queue.Front().Value)
			queue.Remove(queue.Front())
			sum += node.Val
			if node.Children != nil {
				children := node.Children
				for _, child := range children {
					queue.PushBack(child)
				}
			}
		}
	}
	return sum
}

func getNodeFromQueueElement(element any) Node {
	if node, ok := element.(Node); ok {
		return node
	} else {
		return Node{}
	}
}
