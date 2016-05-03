package java.time

import scalajs.moment.{Moment, Units}

/**
  * Created by Haak on 03.05.2016.
  */
object Duration {
  def ofDays(n: Long) = new Duration(Moment.duration(n, Units.Day))
  def ofHours(n: Long) = new Duration(Moment.duration(n, Units.Hour))
  def ofMillis(n: Long) = new Duration(Moment.duration(n, Units.Millisecond))
  def ofMinutes(n: Long) = new Duration(Moment.duration(n, Units.Minute))
  def ofNanos(n: Long) =
    new Duration(Moment.duration(n / 1000000, Units.Millisecond))
  def ofSeconds(n: Long) = new Duration(Moment.duration(n, Units.Second))
}

final class Duration(val moment: scalajs.moment.Duration) {
  def abs: Duration = {
    val millis = Math.abs(moment.millisecond())
    new Duration(Moment.duration(millis, Units.Millisecond))
  }

  def isZero: Boolean = {
    moment.asMilliseconds() == 0
  }

  def plusDays(n: Long): Duration = {
    val newDuration = moment.add(n, Units.Day)
    new Duration(newDuration)
  }

  def plusHours(n: Long): Duration = {
    val newDuration = moment.add(n, Units.Hour)
    new Duration(newDuration)
  }

  def plusMillis(n: Long): Duration = {
    val newDuration = moment.add(n, Units.Millisecond)
    new Duration(newDuration)
  }

  def plusMinutes(n: Long): Duration = {
    val newDuration = moment.add(n, Units.Minute)
    new Duration(newDuration)
  }

  def plusNanos(n: Long): Duration = {
    val newDuration = moment.add(n / 1000000, Units.Millisecond)
    new Duration(newDuration)
  }

  def plusSeconds(n: Long): Duration = {
    val newDuration = moment.add(n, Units.Second)
    new Duration(newDuration)
  }

  def minusDays(n: Long): Duration = {
    val newDuration = moment.subtract(n, Units.Day)
    new Duration(newDuration)
  }

  def minusHours(n: Long): Duration = {
    val newDuration = moment.subtract(n, Units.Hour)
    new Duration(newDuration)
  }

  def minusMillis(n: Long): Duration = {
    val newDuration = moment.subtract(n, Units.Millisecond)
    new Duration(newDuration)
  }

  def minusMinutes(n: Long): Duration = {
    val newDuration = moment.subtract(n, Units.Minute)
    new Duration(newDuration)
  }

  def minusNanos(n: Long): Duration = {
    val newDuration = moment.subtract(n / 1000000, Units.Millisecond)
    new Duration(newDuration)
  }

  def minusSeconds(n: Long): Duration = {
    val newDuration = moment.subtract(n, Units.Second)
    new Duration(newDuration)
  }

  def toDays: Long = moment.day()
  def toHours: Long = moment.hour()
  def toMillis: Long = moment.millisecond()
  def toMinutes: Long = moment.minute()
  def toNanos: Long = moment.millisecond() * 1000000

  def withSeconds(seconds: Long): Duration = new Duration(Moment.duration(seconds, Units.Second))
}
