/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pipiolo.creation.factory

import com.pipiolo.creation.factory.ShapeType.ShapeType

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
