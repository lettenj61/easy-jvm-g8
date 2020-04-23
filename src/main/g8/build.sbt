lazy val scalaV = "$scalaVersion$"

// Project information
scalaVersion  := scalaV
organization  := "$organization$"
version       := "0.1.0-SNAPSHOT"
name          := "$name$"
description   := "$description$"

scalacOptions in (Compile, compile) ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  // "-Xfatal-warnings",
  // "-Xlint",
  // "-Yno-adapted-args",
  // "-Ywarn-dead-code",
  // "-Ywarn-numeric-widen",
  // "-Ywarn-value-discard",
  // "-Ywarn-unused-import",
  // "-Ywarn-unused"
)
