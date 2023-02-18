import java.util.HashSet;

public class QuestionEight {

	// Runtime Complexity O(N) Space Complexity O(N)
	public static int indexOfFirstDuplicate(int[] numbers) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			if (set.contains(number)) {
				return i;
			}
			set.add(number);
		}
		return -1;
	}
}
