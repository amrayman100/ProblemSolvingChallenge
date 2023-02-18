package questions

/*
		(define (compose f g)
  		(lambda (x)(f (g x))))
*/

func H(x int) int {
	square := func(x int) int { return x * x }
	inc := func(x int) int { return x + 1 }
	return square(inc(x))
}
