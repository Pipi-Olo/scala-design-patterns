/*
 * Copyright 2024 PipiOlo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pipiolo.creational.factorymethod

object Main extends App {
  private val circle = ShapeFactory.createShape(ShapeType.Circle)
  circle.foreach(_.draw())

  private val square = ShapeFactory.createShape(ShapeType.Square)
  square.foreach(_.draw())

  private val triangle = ShapeFactory.createShape(ShapeType.Triangle)
  triangle.foreach(_.draw())
}
