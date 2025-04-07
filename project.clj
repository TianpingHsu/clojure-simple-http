(defproject clojure-simple-http "0.1.0-SNAPSHOT"
  :author "Divyum Rastogi"
  :description "A simple HTTP server"
  :min-lein-version "2.7.1"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
               [ring "1.6.3"]
               [compojure "1.6.1"]]
  :main clojure-simple-http.core)
