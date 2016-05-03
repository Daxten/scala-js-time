package java.time

import scalajs.moment._

object LocalDateTime {
  def ofEpochSecond(
      epochSecond: Long, nanoSecond: Int, zoneOffset: ZoneOffset) = {
    val moment = Moment.utc(epochSecond * 1000 * 1000 + nanoSecond)
    moment.utcOffset(zoneOffset.getTotalSeconds / (60 * 60))
    new LocalDateTime(moment)
  }
}

final class LocalDateTime(val moment: Date) {
  def toEpochSecond(zoneOffset: ZoneOffset): Long = moment.format("X").toLong
}
