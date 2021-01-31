package chapter04

object Scala05_DoWhile {
  def main(args: Array[String]): Unit = {
    var i = 1
    do {
      println(i + " hello!")
      i += 1
    } while (i <= 100)
  }
}
