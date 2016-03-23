#lang racket
(define (survives-positions position n list)
  (if (= position n) list
      (if (survives? position n) (survives-positions (+ position 1) n(cons position list))
          (survives-positions(+ position 1) n list))))


(define survives?
(lambda (position n)
  (if (< n 3) #t
      (if (= position 3) #f
          (survives? (modulo (+ position (- n 3)) n)
          (- n 1))))))

(survives-positions 1 8 '())
