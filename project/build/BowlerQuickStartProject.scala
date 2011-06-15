import sbt._
import net.usersource.jettyembed._

class BowlerProject(info: ProjectInfo) extends JettyEmbedWebProject(info, JETTY7) {
  val bowler = "org.bowlerframework" %% "core" % "0.5-SNAPSHOT"

  val slf4jVersion = "1.6.0"

  val sfl4jnop = "org.slf4j" % "slf4j-nop" % slf4jVersion % "runtime"

  // allows you to use an embedded/in-JVM jetty-server to run unit-tests.
  val scalatraTest = "org.scalatra" %% "scalatra-scalatest" % "2.0.0-SNAPSHOT" % "test"

  val jetty7 = "org.eclipse.jetty" % "jetty-server" % "7.4.1.v20110513"
  val jettyWebapp = "org.eclipse.jetty" % "jetty-webapp" % "7.4.1.v20110513"

  val servletApi = "javax.servlet" % "servlet-api" % "2.5" % "provided"

  val sonatypeNexusSnapshots =
    "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  val sonatypeNexusReleases =
    "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases"

  val scalaToolsRepo = "Scala-Tools repo" at "http://scala-tools.org/repo-releases/"
  val fuseSourceSnapshots = "FuseSource Snapshot Repository" at "http://repo.fusesource.com/nexus/content/repositories/snapshots"
  val scalaToolsnapshots = "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"
}