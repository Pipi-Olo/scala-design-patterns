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

package com.pipiolo.bahavior.observer

object Main extends App {
  private val weather = new WeatherSubject(0.0, 1.0)

  private val chrome = new ChromeObserver(weather)
  private val safari = new SafariObserver(weather)

  println(s"chrome: ${chrome.getTemperature}")
  println(s"safari: ${safari.getTemperature} / ${safari.getPresser}")

  weather.update(10.0, 2.0)

  println(s"chrome: ${chrome.getTemperature}")
  println(s"safari: ${safari.getTemperature} / ${safari.getPresser}")

  // remove observer
  weather.removeObserver(chrome)

  weather.update(30.0, 3.0)

  println(s"chrome: ${chrome.getTemperature}")
  println(s"safari: ${safari.getTemperature} / ${safari.getPresser}")
}
