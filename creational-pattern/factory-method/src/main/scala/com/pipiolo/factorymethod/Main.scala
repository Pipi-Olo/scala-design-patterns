package com.pipiolo.factorymethod

import com.pipiolo.creation.factory.{ShapeFactory, ShapeType}

object Main extends App {

  // factory
  private val circle = ShapeFactory.createShape(ShapeType.Circle)
  circle.foreach(_.draw())

  private val square = ShapeFactory.createShape(ShapeType.Square)
  square.foreach(_.draw())

  private val triangle = ShapeFactory.createShape(ShapeType.Triangle)
  triangle.foreach(_.draw())
}
