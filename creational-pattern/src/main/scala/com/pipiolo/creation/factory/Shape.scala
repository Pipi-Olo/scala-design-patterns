package com.pipiolo.creation.factory

trait Shape {
  def draw(): Unit
}

object ShapeType extends Enumeration {
  type ShapeType = Value

  val Circle, Square, Triangle = Value
}
