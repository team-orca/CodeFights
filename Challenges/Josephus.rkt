(define survives?
(lambda (position n)
  (if (< n 3) #t
      (if (= position 3) #f
          (survives? (modulo (+ position (- n 3)) n)
          (- n 1))))))
