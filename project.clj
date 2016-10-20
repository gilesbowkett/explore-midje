(defproject explore-midje "0.1.0-SNAPSHOT"
  :description "explore Midje"
  :url "https://github.com/gilesbowkett/explore-midje"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[midje "1.8.3" :exclusions [org.clojure/clojure]]]
                    :plugins [[lein-midje "3.2.1"]]}})

