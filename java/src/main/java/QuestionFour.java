import java.util.function.Function;

public class QuestionFour {

	/*
		(define (compose f g)
  		(lambda (x)(f (g x))))
	 */

	public static int h(int x) {
		Function<Integer, Integer> inc = (integer -> integer + 1);
		Function<Integer, Integer> square = (integer -> integer * integer);
		return square.compose(inc).apply(x);
	}
}
