package chapter04

object Scala03_ForExer2 {
  def main(args: Array[String]): Unit = {
    /**
     * 完成下面的表达式输出
     * 0 + 6 = 6
     * 1 + 5 = 6
     * 2 + 4 = 6
     * 3 + 3 = 6
     * 4 + 2 = 6
     * 5 + 1 = 6
     * 6 + 0 = 6
     */

    for(i <- 0 to 6;j = 6 - i) {
      println(i + " + " + j + " = " + (i + j))
    }
  }
}
