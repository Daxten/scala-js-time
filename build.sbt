lazy val scalaJsMomentJs = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "implementation of the java time api using moment.js"

normalizedName := "scala-js-time"

version := "0.1-SNAPSHOT"

organization := "com.github.daxten"

scalaVersion := "2.11.8"

val MomentVersion = "2.13.0"
val MomentTimezoneVersion = "0.5.3"

libraryDependencies ++= Seq(
  "org.webjars.npm" % "moment" % MomentVersion,
  "org.webjars.npm" % "moment-timezone" % MomentTimezoneVersion)

jsDependencies ++= Seq(
  "org.webjars.npm" % "moment" % MomentVersion
    / s"$MomentVersion/moment.js" minified "min/moment.min.js",

  "org.webjars.npm" % "moment" % MomentVersion
    / s"moment/$MomentVersion/min/locales.js"
    minified "min/locales.min.js"
    dependsOn s"$MomentVersion/moment.js",

  "org.webjars.npm" % "moment-timezone" % MomentTimezoneVersion
    / "moment-timezone-with-data.js"
    minified "builds/moment-timezone-with-data.min.js"
    dependsOn s"moment/$MomentVersion/min/locales.js"
)

pomExtra :=
  <url>https://github.com/Daxten/scala-js-time</url>
  <licenses>
    <license>
      <name>Apache-2.0</name>
      <url>https://www.apache.org/licenses/LICENSE-2.0.html</url>
    </license>
  </licenses>
  <scm>
    <url>git://github.com/Daxten/scala-js-time.git</url>
  </scm>
  <developers>
    <developer>
      <id>alexej</id>
      <name>Alexej Haak</name>
      <url>https://github.com/Daxten/</url>
    </developer>
  </developers>
