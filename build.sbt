ThisBuild / version := "0.2.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "scala-design-patterns"
  )

lazy val abstractFactoryPattern = (project in file("creational-pattern/abstract-factory"))
  .settings(
    name := "scala-design-patterns-creational-abstract-factory-pattern"
  )