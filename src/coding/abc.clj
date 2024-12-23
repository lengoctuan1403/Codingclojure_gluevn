(ns coding.abc)

(defn print-my-name
  []
(println "My name is Le Ngoc Tuan"))

(print-my-name)

(defn print-your-name
  [yourname]
  (println "Your name is"yourname))

(print-your-name "Phong")

(defn print-age
  []
  (println "Nhap vao nam sinh cua ban")
  (let [year (Integer/parseInt (read-line))]
    (println "Ban" (- 2024 year) "tuoi roi")))

(print-age)