import java.util.ArrayList;
import java.util.LinkedHashMap;

public class QuestionFive {

	public static String[] unique(String[] words) {
		LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();
		for (String word : words) {
			wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
		}

		ArrayList<String> resultList = new ArrayList<>();

		for (String word : wordMap.keySet()) {
			if (wordMap.get(word) == 1) {
				resultList.add(word);
			}
		}
		String[] resultArray = new String[resultList.size()];
		return resultList.toArray(resultArray);
	}
}
