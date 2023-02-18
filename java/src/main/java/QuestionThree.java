public class QuestionThree {

	public static String runLengthEncode(String s) {
		String encodedString = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				encodedString += s.charAt(i) + Integer.toString(count);
				count = 1;
			}
		}
		return encodedString;
	}

	public static String runLengthDecode(String s) {
		String decodedString = "";
		String countString = "";
		int left = 0;
		int right = 1;

		while (right < s.length()) {
			if (!Character.isAlphabetic(s.charAt(right))) {
				countString += s.charAt(right);
				right++;
			}
			if (right == s.length() || Character.isAlphabetic(s.charAt(right))) {
				int count;
				if (countString == "") {
					count = 1;
				} else {
					count = Integer.parseInt(countString);
				}
				decodedString = populateString(decodedString, s.charAt(left), count);
				countString = "";
				left = right;
				right++;
			}
		}
		return decodedString;
	}

	private static String populateString(String stringToPopulate, char c, int count) {
		for (int j = 0; j < count; j++) {
			stringToPopulate += c;
		}
		return stringToPopulate;
	}
}
