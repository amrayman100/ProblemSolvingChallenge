import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

// Breadth First Search approach //
public class QuestionNine {
	public static int sum(Node root) {
		int sum = 0;
		if (root == null) return 0;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node node = queue.poll();
				sum += node.val;
				if (node.children != null) Collections.addAll(queue, node.children);
			}
		}
		return sum;
	}
}
