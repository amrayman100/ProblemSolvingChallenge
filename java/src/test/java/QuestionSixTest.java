import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class QuestionSixTest {

	@ParameterizedTest
	@MethodSource("provideMatrixForTranspose")
	void testTransposeTwoByTwo(int[][] input, int[][] expected) {
		assertThat(QuestionSix.transpose(input)).isEqualTo(expected);
	}

	private static Stream<Arguments> provideMatrixForTranspose() {
		return Stream.of(
				Arguments.of(new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 3}, {2, 4}}),
				Arguments.of(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}}, new int[][]{{1, 5}, {2, 6}, {3, 7}, {4, 8}})
		);
	}

}
