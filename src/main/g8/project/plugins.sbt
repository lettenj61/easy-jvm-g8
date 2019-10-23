resolvers += Classpaths.sbtPluginReleases
resolvers += "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
// addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")