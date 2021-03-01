name := "sbt-scalafmt-howto"

version := "1.0.0"

scalaVersion := "2.12.10"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

// Execute scalafmtCheck on compile.
(Compile / compile) := (Compile / compile).dependsOn(scalafmtCheckAll).value
