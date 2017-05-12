scalaVersion := "2.11.11"

name := "webpush-scala"

libraryDependencies ++= (
  ("nl.martijndwars" % "web-push" % "3.0.0") ::
  ("com.github.xuwei-k" %% "play-json-extra" % "0.4.3") ::
  ("org.webjars" % "clipboard.js" % "1.6.1") ::
  ("org.webjars" % "jquery" % "3.2.0") ::
  ("org.webjars" %% "webjars-play" % "2.5.0-3") ::
  Nil
)

fork in Test := true
fork in run := true

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)

enablePlugins(PlayScala)

javaOptions ++= sys.process.javaVmArguments.filter(
  a => Seq("-Xmx", "-Xms", "-XX").exists(a.startsWith)
)

licenses := Seq("MIT License" -> url("https://opensource.org/licenses/MIT"))
