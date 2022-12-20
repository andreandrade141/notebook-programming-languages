; Clojure is Based on LISP and runs on the JVM. It is a functional language.
; It does not have variables, but instead uses immutable data structures.
; It is a dynamic language, meaning that it does not require type declarations.

; This is a comment.

(ns clojure) ; This is a namespace declaration.

; These are basic data types
(class 1) ; This is an integer.
(class 1.0) ; This is a float.
(class true) ; This is a boolean.
(class "Hello World") ; This is a string.
(class nil) ; This is a null value.

; This is basic math
(+ 1 2)
(- 1 2)
(* 1 2)
(/ 1 2)

; You can increase the value of a number using the inc keyword:
(inc 1) ; this will return 2
; You can decrease the value of a number using the dec keyword:
(dec 1) ; this will return 0

; This is how you use logic operators:
(= 1 2) ; This is false.
(= 1 1) ; This is true.
(> 1 2) ; This is false.
(> 1 1) ; This is false.
(> 1 0) ; This is true.
(< 1 2) ; This is true.
(< 1 1) ; This is false.
(< 1 0) ; This is false.

; These are collections declarations:
; vectors
[1 2 3]
; lists
(1 2 3)
; maps
{:a 1 :b 2 :c 3}
; sets
#{1 2 3}

; Using ' will not evaluate the expression
'(+ 1 2) ; This is not 3, but a list with 3 positions: +(char), 1(int), 2(int).
; another way to declare a list of objects is using the list keyword:
(list + 1 2) ; This is the same as the previous example
; but if you use the eval keyword, the list will be evaluated:
(eval'(+ 1 2)) ; This is 3.

; This is a way to declare an infinite or finite series of numbers:
(range) ; this is a infinite series of numbers starting at 0.
(range 10) ; this is a finite series of numbers starting at 0 and ending at 9.
(range 1 10) ; this is a finite series of numbers starting at 1 and ending at 9.
(range 1 10 2) ; this is a finite series of numbers starting at 1 and ending at 9, but with a step of 2.
; You can also use the take keyword to get the first n elements of a series:
(take 10 (range)) ; this will return the first 10 elements of the infinite series of numbers starting at 0.

; Vector and lists Operations:
; You can add a new element to a vector or list using the conj keyword:
(conj [1 2 3] 4) ; this will return [1 2 3 4]
(conj (1 2 3) 4) ; this will return (4 1 2 3)
; conj can optimize the operation dependingon the type of collection.
; You can add lists and vectors together using the concat keyword:
(concat [1 2 3] '(4 5 6)) ; this will return [1 2 3 4 5 6]

; You can combine map and inc keywords to add n to each list/vector elements:
(map inc [1 2 3]) ; this will return [2 3 4]
(map inc '(1 2 3)) ; this will return (2 3 4)

; You can also filter a list/vector using the filter keyword:
(filter even? [1 2 3 4 5 6]) ; this will return [2 4 6]
(filter even? '(1 2 3 4 5 6)) ; this will return (2 4 6)

; To reduce a list/vector to a single value you can use the reduce keyword:
(reduce + [1 2 3 4 5 6]) ; this will return 21 (1+2+3+4+5+6)
(reduce + '(1 2 3 4 5 6)) ; this will return 21 (1+2+3+4+5+6)

; You can also reduce to a different type of collection:
(reduce conj [] '(3 2 1)) ; this will return [3 2 1]

