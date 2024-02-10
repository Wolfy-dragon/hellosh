(+ 1 1)
(* 123456789000000000000 837745391234565375445678987654345)
(def Jarold "🍅")
Jarold
(str Jarold Jarold Jarold Jarold Jarold Jarold Jarold Jarold Jarold Jarold Jarold)
(repeat 100000 Jarold)
(def Wolfy-Jarold "🐺")
Wolfy-Jarold
(apply str (repeat 100 Wolfy-Jarold))
 (defn Jarold-factory [] Jarold)
(defn Wolfy-Jarold-factory [] Wolfy-Jarold)
 (apply str (take 1000 (interleave ( repeatedly Jarold-factory ) (repeatedly Wolfy-Jarold-factory))))