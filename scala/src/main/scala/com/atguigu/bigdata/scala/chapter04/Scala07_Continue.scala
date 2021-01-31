package chapter04

object Scala07_Continue{
  def main(args: Array[String]): Unit = {
    /**
     * Scala内置控制结构特地也去掉了continue，是为了更好的适应函数化编程，
     * 可以使用if – else 或是 循环守卫实现continue的效果
     */

    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println("i = " + i)
    }

    //等价于下面的代码

    for (i <- 1 to 10) {
      if (i != 2 && i != 3) {
        println("i = " + i)
      }
    }
  }
}
