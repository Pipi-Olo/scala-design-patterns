ThisBuild / version := "0.3.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "scala-design-patterns"
  )

// Behavior Pattern
lazy val observerPattern = (project in file("behavior-pattern/observer"))
  .settings(
    name := "scala-design-patterns-behavior-observer-pattern"
  )

// Creational Pattern
lazy val factoryMethodPattern = (project in file("creational-pattern/factory-method"))
  .settings(
    name := "scala-design-patterns-creational-factory-method-pattern"
  )