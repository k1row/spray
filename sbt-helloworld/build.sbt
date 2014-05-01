name := "sbt-helloworld"

version := "1.0"


libraryDependencies ++= Seq(
  "com.typesafe" %% "scalalogging-slf4j" % "1.0.1",
  "org.slf4j" % "slf4j-api" % "1.7.1",
  "ch.qos.logback" % "logback-classic" % "1.0.7"
)