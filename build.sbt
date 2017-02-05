name := "twitter-fetcher"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq("org.twitter4j" % "twitter4j-core" % "4.0.6",
  "org.scalatest" %% "scalatest" % "3.0.1",
  "log4j" % "log4j" % "1.2.17",
  "com.typesafe" % "config" % "1.3.1",
  "org.scalatest" %% "scalatest" % "3.0.1"
)
    