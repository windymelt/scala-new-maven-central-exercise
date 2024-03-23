val scala3Version = "3.4.0"

import xerial.sbt.Sonatype.sonatypeCentralHost

ThisBuild / sonatypeCredentialHost := sonatypeCentralHost
ThisBuild / publishTo := sonatypePublishToBundle.value

lazy val root = project
  .in(file("."))
  .settings(
    organization := "dev.capslock",
    organizationName := "capslock.dev",
    startYear := Some(2024),
    licenses += License.MIT,
    homepage := Some(
      url(
        "https://github.com/windymelt/scala-new-maven-central-exercise"
      )
    ),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/windymelt/scala-new-maven-central-exercise"),
        "https://github.com/windymelt/scala-new-maven-central-exercise.git"
      )
    ),
    developers += Developer(
      "windymelt",
      "windymelt",
      "windymelt@3qe.us",
      url("https://www.3qe.us/")
    ),
    name := "scala-new-maven-central-exercise",
    version := "0.0.1",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
