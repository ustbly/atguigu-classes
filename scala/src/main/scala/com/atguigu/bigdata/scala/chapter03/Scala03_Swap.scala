package chapter03

object Scala03_Swap {
  def main(args: Array[String]): Unit = {
    var a = 20
    var b = 10

    //第一种方法
    /*var t = a
    a = b
    b = t*/

    //第二种方法
   /* a = a + b //a = 30
    b = a - b //b = 20
    a = a - b //a = 10*/

    //第三种方法
    a = a ^ b
    b = a ^ b
    a = a ^ b

    println("a = " + a + " b = " + b)
  }
}
