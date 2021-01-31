package chapter04

object Scala03_For1 {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3; j = 4 - i) {
      print(j + " ")
    }

    println()


    //嵌套循环
    for(i <- 1 to 3) {
      for (j <- 1 to 3) {
        print(j + " ")
      }
      println()
    }
  }
}
