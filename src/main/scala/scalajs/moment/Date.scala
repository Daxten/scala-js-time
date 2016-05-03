package scalajs.moment

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSName

/**
  original source: https://github.com/widok/scala-js-momentjs
 */

@js.native
trait CalendarOpts extends js.Object {
  val sameDay: UndefOr[String] = js.native
  val nextDay: UndefOr[String] = js.native
  val lastDay: UndefOr[String] = js.native
  val lastWeek: UndefOr[String] = js.native
  val sameElse: UndefOr[String] = js.native
}

@js.native
trait Date extends js.Object with Getters with Setters[Date] {
  def toDate(): js.Date = js.native
  def toISOString(): String = js.native
  def fromNow(): String = js.native
  def fromNow(withoutSuffix: Boolean): String = js.native
  def isDate(): Boolean = js.native
  def isValid(): Boolean = js.native
  def format(): String = js.native
  def format(pattern: String): String = js.native
  def startOf(unit: String): Date = js.native
  def endOf(unit: String): Date = js.native
  def calendar(): String = js.native
  def calendar(reference: Date): String = js.native
  def calendar(reference: UndefOr[Date], opts: CalendarOpts): String = js.native
  def isBefore(date: Date): Boolean = js.native
  def isBefore(date: Date, unit: String): Boolean = js.native
  def isAfter(date: Date): Boolean = js.native
  def isAfter(date: Date, unit: String): Boolean = js.native
  def isSame(date: Date): Boolean = js.native
  def isSame(date: Date, unit: String): Boolean = js.native
  def diff(date: Date): Int = js.native
  def diff(date: Date, unit: String): Int = js.native
  def diff(date: Date, unit: String, asFloat: Boolean): Double = js.native
  def local(): Date = js.native
  def utc(): Date = js.native
  def utcOffset(): Int = js.native
  def utcOffset(newOffset: String): Int = js.native
  def utcOffset(newOffset: Int): Int = js.native

  def milliseconds(): Int = js.native
  def seconds(): Int = js.native
  def minutes(): Int = js.native
  def hours(): Int = js.native
  def Ints(): Int = js.native
  def days(): Int = js.native
  def weekday(): Int = js.native
  def isoWeekday(): Int = js.native
  def isoWeekday(newDay: Int): Int = js.native
  def dayOfYear(): Int = js.native
  def weeks(): Int = js.native
  def isoWeeks(): Int = js.native
  def months(): Int = js.native
  def quarter(): Int = js.native
  def years(): Int = js.native
  def weekYear(): Int = js.native
  def isoWeekYear(): Int = js.native

  def milliseconds(n: Int): Date = js.native
  def seconds(n: Int): Date = js.native
  def minutes(n: Int): Date = js.native
  def hours(n: Int): Date = js.native
  def dates(n: Int): Date = js.native
  def days(n: Int): Date = js.native
  def weekday(n: Int): Date = js.native
  def dayOfYear(n: Int): Date = js.native
  def weeks(n: Int): Date = js.native
  def isoWeeks(n: Int): Date = js.native
  def months(n: Int): Date = js.native
  def quarter(n: Int): Date = js.native
  def years(n: Int): Date = js.native
  def weekYear(n: Int): Date = js.native
  def isoWeekYear(n: Int): Date = js.native

  def tz(tz: String): Date = js.native

  @JSName("valueOf")
  def value(): Double = js.native
}
