package chapter04

object Scala03_ForExer1 {
  def main(args: Array[String]): Unit = {
    /**
     * 1) 打印1~100之间所有是9的倍数的整数的个数及总和
     */
    var count = 0
    var sum = 0
    for (i <- 1 to 100) {
      if (i % 9 == 0) {
        count += 1
        sum += i
      }
    }
    println("个数为：" + count)
    println("总数为：" + sum)
  }
}
