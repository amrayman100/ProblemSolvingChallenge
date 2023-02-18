import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class QuestionOneTest {

	@ParameterizedTest
	@MethodSource("provideStringsForIsPalindrome")
	void testPalindrome(String input, boolean expected) {
		assertThat(QuestionOne.palindrome(input)).isEqualTo(expected);
	}

	private static Stream<Arguments> provideStringsForIsPalindrome() {
		return Stream.of(
				Arguments.of("anna", true),
				Arguments.of("aaaaa", true),
				Arguments.of("xhx", true),
				Arguments.of("", true),
				Arguments.of("A man, a plan, a canal – Panama", true),
				Arguments.of("no lemon, no melon", true),
				Arguments.of("taco cat", true),
				Arguments.of("never odd or even", true),
				Arguments.of("amber", false),
				Arguments.of("xyaytaaa", false),
				Arguments.of("bbttTTT", false)
		);
	}

}
