package chapter04

object Scala04_While {
  def main(args: Array[String]): Unit = {
   var i = 1
    /*
   while (i <= 10) {
     println(i + " hello world!")
     i += 1
   }
   */

    /**
     * 打印1—100之间所有能被3整除的数
     */
    while (i <= 100) {
      if(i % 3 == 0) {
        print(i + " ")
      }
      i += 1
    }

  }
}
