import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class QuestionFourTest {

	@ParameterizedTest
	@MethodSource("provideNumbersForComposition")
	void testComposition(int input, int expected) {
		assertThat(QuestionFour.h(input)).isEqualTo(expected);
	}

	private static Stream<Arguments> provideNumbersForComposition() {
		return Stream.of(
				Arguments.of(6, 49),
				Arguments.of(1, 4),
				Arguments.of(2, 9)
		);
	}
}
