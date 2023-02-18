import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class QuestionEightTest {

	@ParameterizedTest
	@MethodSource("provideArraysForFirstDuplicate")
	void testIndexOfFirstDuplicateIfDuplicateExists(int[] input, int expectedIndex) {
		int firstDuplicateIndex = QuestionEight.indexOfFirstDuplicate(input);
		assertThat(firstDuplicateIndex).isEqualTo(expectedIndex);
	}

	private static Stream<Arguments> provideArraysForFirstDuplicate() {
		return Stream.of(
				Arguments.of(new int[]{5, 17, 3, 17, 4, -1}, 3),
				Arguments.of(new int[]{5, 17, 3}, -1)
		);
	}
}
