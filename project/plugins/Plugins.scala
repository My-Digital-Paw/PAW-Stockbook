import sbt._

class LiftPlugins(info: ProjectInfo) extends PluginDefinition(info) {
  // eclipsify plugin
  lazy val eclipse = "de.element34" % "sbt-eclipsify" % "0.7.0"
}
