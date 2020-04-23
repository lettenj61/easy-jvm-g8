resolvers += Classpaths.sbtPluginReleases
resolvers += "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.4")