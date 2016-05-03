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
}
