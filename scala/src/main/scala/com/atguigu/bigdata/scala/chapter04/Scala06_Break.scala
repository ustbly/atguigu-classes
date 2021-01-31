package chapter04

import scala.util.control.Breaks.{break, breakable}

/**
 * Scala内置控制结构特地去掉了break和continue，是为了更好的适应函数化
 * 编程，推荐使用函数式的风格解决break和contine的功能，而不是一个关键字。
 */
object Scala06_Break {
  def main(args: Array[String]): Unit = {
    var n = 10
    breakable {
      while (n <= 20) {
        n += 1
        if (n <= 18){
          break()
        }
      }
    }
    println("n = " + n)
  }
}
