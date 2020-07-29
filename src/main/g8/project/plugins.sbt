resolvers += Classpaths.sbtPluginReleases
resolvers += "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.10")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.4")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.2")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
