(ns pinq.core)

(defn flip
	"A Bernoulli random variable."
	[p]
	(if (< (rand) p) 1 0))
