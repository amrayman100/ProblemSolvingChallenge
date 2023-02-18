import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class QuestionNineTest {
	private Node root;

	private int sumOfNodes = 0;

	@AfterEach
	void cleanUp() {
		root = null;
		sumOfNodes = 0;
	}

	@Test
	void testTreeSumIsEqualToExpectedSum() {
		prepareTree();
		assertThat(QuestionNine.sum(root)).isEqualTo(sumOfNodes);
	}

	private void prepareTree() {
		Node n11 = new Node(3);
		sumOfNodes += n11.val;
		Node n12 = new Node(3);
		sumOfNodes += n12.val;
		Node n13 = new Node(3);
		sumOfNodes += n13.val;
		Node n21 = new Node(3);
		sumOfNodes += n21.val;
		Node n22 = new Node(3);
		sumOfNodes += n22.val;
		Node n23 = new Node(3);
		sumOfNodes += n23.val;
		Node n1 = new Node(3, new Node[]{n11, n12, n13});
		Node n2 = new Node(3, new Node[]{n21, n22, n23});
		sumOfNodes += n1.val;
		sumOfNodes += n2.val;
		root = new Node(2, new Node[]{n1, n2});
		sumOfNodes += root.val;
	}
}
