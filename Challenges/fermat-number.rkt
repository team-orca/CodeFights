#language racket

(define fermat-number
(lambda (n) (+ (repeadetly-square 2 n) 1)))

(define repeadetly-square (lambda(b n) (if (= n 0) b
(repeadetly-square (* b b) (- n 1)))))

;test
(fermat-number 8)
