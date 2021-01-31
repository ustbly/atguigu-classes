package chapter03

object Scala01_Operator2 {
  /**
   * 关系运算符
   */
  def main(args: Array[String]): Unit = {

    var a = 9
    var b = 8
    println(a > b) // true
    println(a >= b) // true
    println(a <= b) // false
    println(a < b) // false
    println(a == b) // false
    println(a != b) // true
    var flag: Boolean = a > b
    println(flag)// true


  }
}
