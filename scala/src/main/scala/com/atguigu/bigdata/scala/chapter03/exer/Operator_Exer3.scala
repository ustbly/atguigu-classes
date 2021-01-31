package chapter03.exer

object Operator_Exer3 {
  /**
   * 交换两个数的值。
   * @param args
   */
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 99
    println("a="+a+"\tb="+b)
    //交换
    val t = a
    a = b
    b = t
    println("a="+a+"\tb="+b)
  }
}
