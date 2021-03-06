(defproject org.onyxplatform/onyx-amazon-s3 "0.11.1.0"
  :description "Onyx plugin for Amazon S3"
  :url "https://github.com/onyx-platform/onyx-amazon-s3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"snapshots" {:url "https://clojars.org/repo"
                              :username :env
                              :password :env
                              :sign-releases false}
                 "releases" {:url "https://clojars.org/repo"
                             :username :env
                             :password :env
                             :sign-releases false}}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ^{:voom {:repo "git@github.com:onyx-platform/onyx.git" :branch "master"}}
                 [org.onyxplatform/onyx "0.11.1"]
                 [com.amazonaws/aws-java-sdk-core "1.11.125"]
                 [com.amazonaws/aws-java-sdk-s3 "1.11.125"]]
  :global-vars  {*warn-on-reflection* true}
  :jvm-opts ["-Xmx2500M"]
  :profiles {:circle-ci {:jvm-opts ["-Xmx2500M"
                                    "-XX:+UnlockCommercialFeatures"
                                    "-XX:+FlightRecorder"
                                    "-XX:StartFlightRecording=duration=1080s,filename=recording.jfr"]}
             :dev {:dependencies []
                   :plugins [[lein-set-version "0.4.1"]
                             [lein-update-dependency "0.1.2"]
                             [lein-pprint "1.1.1"]]}})
