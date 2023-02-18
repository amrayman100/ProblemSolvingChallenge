public class QuestionOne {

	// This function handles the scenario if the input is a phrase and a palindrome such as A man, a plan, a canal – Panama //
	public static boolean palindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (right > left) {
			if (!Character.isLetterOrDigit(s.charAt(left))) {
				left++;
				continue;
			}
			if (!Character.isLetterOrDigit(s.charAt(right))) {
				right--;
				continue;
			}
			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
