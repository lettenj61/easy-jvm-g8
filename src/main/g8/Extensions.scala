package example

import java.io._
import java.nio.file._
import java.util.Properties

object Extensions {
  object io {
    implicit class PathSyntax(val repr: Path) extends AnyVal {
      def / (that: Path): Path =
        repr resolve that

      def / (that: File): Path =
        repr resolve that.toPath

      def / (that: String): Path =
        repr resolve that

      def `..` : Path = repr.getParent
    }
  }

  object cli {
    lazy val optionsRE = """^[\-]{2,2}""".r
    def parseOptions(args: Seq[String]): Properties = {
      val props = new Properties
      val content = args
        .filter(optionsRE.findFirstIn(_).nonEmpty)
        .map(_.dropWhile(_ == '-'))
        .mkString("\n")

      props.load(new StringReader(content))
      props
    }
  }
}
