package java.time

object ZoneOffset {
  def ofTotalSeconds(totalSeconds: Int): ZoneOffset = new ZoneOffset(totalSeconds)
}

final class ZoneOffset(val totalSeconds: Int) {
  def getTotalSeconds: Int = totalSeconds
}

