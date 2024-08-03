ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "scala-design-patterns"
  )

lazy val creationalPattern = (project in file("creational-pattern"))
  .settings(
    name := "scala-design-patterns-creational-pattern"
  )