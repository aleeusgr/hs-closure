(defproject hs-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :main hs-clojure.core
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [cheshire "5.10.0"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-jetty-adapter "1.8.0"]
                 [org.clojure/java.jdbc "0.7.3"]
                 [org.postgresql/postgresql "42.3.1"]
                 [clojure.jdbc/clojure.jdbc-c3p0 "0.3.3"]
                 [com.layerware/hugsql "0.4.8"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler hs-clojure.handler/app}
  :uberjar-name "hs-clojure-standalone.jar"
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
