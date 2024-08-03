package com.pipiolo.factorymethod

import com.pipiolo.factorymethod.ShapeType.ShapeType

object ShapeFactory {
  def createShape(shapeType: ShapeType): Option[Shape] = {
    shapeType match {
      case ShapeType.Circle => Some(new Circle)
      case ShapeType.Square => Some(new Square)
      case ShapeType.Triangle => Some(new Triangle)
      case _ => None
    }
  }
}
