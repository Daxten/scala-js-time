package scalajs.moment

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  original source: https://github.com/widok/scala-js-momentjs
 */

@js.native
trait Duration extends js.Object with Getters with Setters[Duration] {
  @JSName("humanize")
  def humanise(): String = js.native

  @JSName("humanize")
  def humanise(withSuffix: Boolean): String = js.native

  def asMilliseconds: Long = js.native
  def asSeconds: Long = js.native
  def asMinutes: Long = js.native
  def asHours: Long = js.native
  def asDays: Long = js.native
  def asWeeks: Long = js.native
  def asMonths: Long = js.native
  def asYears: Long = js.native
}
