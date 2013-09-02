(ns pinq.core)

;; various discrete and continuous random variables
;; to serve as data types

(defn uniform
  "A discrete uniform random variable."
  [k]
  (/ 1 k))

(defn uniformc
  "A continuous uniform random variable."
  [a b]
  (/ 1 (- b a)))

(defn bernoulli
  "A Bernoulli random variable."
  [p]
  (if (< (rand) p) 1 0))

(defn flip
  "A Bernoulli random variable."
  [k]
  (bernoulli k))

(defn gauss
  "A Gaussian random variable."
  [mu sigma]
  (import '(java.util Random))
  (-> (Random.) .nextGaussian (* sigma) (+ mu)))
