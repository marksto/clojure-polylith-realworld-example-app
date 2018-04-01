(defproject clojure.org.realworld/comments "0.1"
  :description "A comments component"
  :dependencies [[clojure.org.realworld/interfaces "1.0"]
                 [java-jdbc/dsl "0.1.3"]
                 [org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.7.5"]
                 [org.clojure/test.check "0.9.0"]
                 [org.xerial/sqlite-jdbc "3.7.2"]]
  :aot :all)
