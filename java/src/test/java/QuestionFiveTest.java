import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class QuestionFiveTest {

	@ParameterizedTest
	@MethodSource("provideStringsForIsPalindrome")
	void testUnique(String[] input, String[] expected) {
		assertThat(QuestionFive.unique(input)).isEqualTo(expected);
	}

	private static Stream<Arguments> provideStringsForIsPalindrome() {
		return Stream.of(
				Arguments.of(new String[]{"apples", "oranges", "flowers", "apples"}, new String[]{"oranges", "flowers"}),
				Arguments.of(new String[]{"apples", "apples"}, new String[]{})
		);
	}

}
