(defproject departure "1.0.0-SNAPSHOT"
  :description "Extracts departure times from the kvb-koeln.de homepage."
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [enlive/enlive "1.0.0-SNAPSHOT"]
                 [compojure "0.5.3"]
                 [ring/ring-jetty-adapter "0.3.5"]]
  :dev-dependencies [[swank-clojure "1.2.1"]])
