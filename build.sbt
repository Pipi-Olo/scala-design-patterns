import sbt.Keys.libraryDependencies

ThisBuild / version := "0.4.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.14"

val scalaXmlVersion = "2.2.0"

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

// Structure Pattern
lazy val pipelinePattern = (project in file("structure-pattern/pipeline"))
  .settings(
    name := "scala-design-patterns-structure-pipeline-pattern",
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-xml" % scalaXmlVersion
    )
  )
