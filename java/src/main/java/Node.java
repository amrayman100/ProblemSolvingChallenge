import java.util.List;

public class Node {
	public int val;
	public Node [] children;

	public Node() {}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node [] _children) {
		val = _val;
		children = _children;
	}
};