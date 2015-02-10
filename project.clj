(defproject parmenides "0.1.0-SNAPSHOT"
  :description "Record Linkage Service"
  :url "https://github.com/sunlightlabs/parmenides"

  :exclusions [com.stuartsierra/component]

  :dependencies
  [;;Generated by modular
   [hiccup "1.0.5"]
   [om "0.8.0-alpha2"]
   [com.stuartsierra/component "0.2.2"]
   [juxt.modular/bidi "0.7.3"]
   [juxt.modular/cljs "0.5.4"]
   [juxt.modular/clostache "0.6.1"]
   [juxt.modular/http-kit "0.5.3"]
   [juxt.modular/less "0.1.2"]
   [juxt.modular/maker "0.5.0"]
   [juxt.modular/wire-up "0.5.0"]
   [malcolmsparks/co-dependency "0.1.5"]
   [org.clojure/clojure "1.7.0-alpha4"]
   [org.clojure/tools.logging "0.2.6"]
   [org.clojure/tools.reader "0.8.9"]
   [org.slf4j/jcl-over-slf4j "1.7.2"]
   [org.slf4j/jul-to-slf4j "1.7.2"]
   [org.slf4j/log4j-over-slf4j "1.7.2"]
   [org.webjars/bootstrap "3.3.0"]
   [org.webjars/jquery "2.1.0"]
   [org.webjars/react "0.11.1"]
   [prismatic/plumbing "0.3.5"]
   [prismatic/schema "0.3.3"]
   [sablono "0.2.22" :exclusions [com.facebook/react]]
   [ch.qos.logback/logback-classic "1.0.7" :exclusions [org.slf4j/slf4j-api]]
   ;;Added by hand
   [datascript "0.8.0"]
   [ring/ring-json "0.3.1"]
   [racehub/om-bootstrap "0.3.3"]
   [juxt.modular/datomic "0.2.1" :exclusions [com.datomic/datomic-free]]
   [com.datomic/datomic-free "0.9.5130"]
   [instaparse "1.3.5"]
   [org.jordanlewis/data.union-find "0.1.0"]
   [clj-time "0.7.0"]
   [schema-contrib "0.1.3"]
   [org.clojure/data.json "0.2.5"]
   [org.clojure/math.combinatorics "0.0.8"]]

  :main parmenides.main

  :repl-options {:init-ns user
                 :welcome (println "Type (dev) to start")}

  :aliases {"gen" ["run" "-m" "parmenides.generate"]}

  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.5"]]
                   :source-paths ["dev"
                                  ]}})
