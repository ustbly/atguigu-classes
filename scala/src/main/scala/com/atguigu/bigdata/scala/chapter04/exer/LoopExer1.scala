package chapter04.exer

object LoopExer1 {
  def main(args: Array[String]): Unit = {
    /**
     * 打印出九九乘法表
     */

    for (i <- 1 to 9) {
      for(j <- 1 to i) {
        print(j + " * " + i + " = " + (j * i) + "\t")
      }
      println()
    }
  }
}
