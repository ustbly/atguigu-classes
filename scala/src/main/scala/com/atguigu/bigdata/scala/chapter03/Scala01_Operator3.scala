package chapter03

object Scala01_Operator3 {
  /**
   * 逻辑运算符
   */
  def main(args: Array[String]): Unit = {

    var a = true
    var b = false
    println("a && b = " + (a && b)) // false
    println("a || b = " + (a || b)) // true
    println("!(a && b) = " + !(a && b)) // true

  }
}
