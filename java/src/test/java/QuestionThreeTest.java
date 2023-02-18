import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class QuestionThreeTest {

	@ParameterizedTest
	@MethodSource("provideStringsRunLengthEncode")
	void testRunLengthEncode(String input, String expected) {
		assertThat(QuestionThree.runLengthEncode(input)).isEqualTo(expected);
	}

	@ParameterizedTest
	@MethodSource("provideStringsRunLengthDecode")
	void testRunLengthDecode(String input, String expected) {
		assertThat(QuestionThree.runLengthDecode("a10b3a1x4y3z1y1x1")).isEqualTo("aaaaaaaaaabbbaxxxxyyyzyx");
		assertThat(QuestionThree.runLengthDecode("a3")).isEqualTo("aaa");
		assertThat(QuestionThree.runLengthDecode("a3b2x2")).isEqualTo("aaabbxx");
		assertThat(QuestionThree.runLengthDecode("a1")).isEqualTo("a");
		assertThat(QuestionThree.runLengthDecode("a1b1c1")).isEqualTo("abc");
		assertThat(QuestionThree.runLengthDecode("a1b1c1a3")).isEqualTo("abcaaa");
	}

	private static Stream<Arguments> provideStringsRunLengthEncode() {
		return Stream.of(
				Arguments.of("aaaaaaaaaabbbaxxxxyyyzyx", "a10b3a1x4y3z1y1x1"),
				Arguments.of("aaa", "a3"),
				Arguments.of("aaabbxx", "a3b2x2"),
				Arguments.of("a", "a1"),
				Arguments.of("abc", "a1b1c1"),
				Arguments.of("abcaaa", "a1b1c1a3")
		);
	}

	private static Stream<Arguments> provideStringsRunLengthDecode() {
		return Stream.of(
				Arguments.of("a10b3a1x4y3z1y1x1", "aaaaaaaaaabbbaxxxxyyyzyx"),
				Arguments.of("a3", "aaa"),
				Arguments.of("a3b2x2", "aaabbxx"),
				Arguments.of("a1", "a"),
				Arguments.of("a1b1c1", "abc"),
				Arguments.of("a1b1c1a3", "abcaaa")
		);
	}

}
