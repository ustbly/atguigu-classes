package chapter03.exer


/**
 * 1) 案例1：求两个数的最大值
 * 2) 案例2：求三个数的最大值
 */
object Operator_Exer4 {
  //1) 案例1：求两个数的最大值
  /*
  def main(args: Array[String]): Unit = {
    var a = 10;
    var b = 20;
    //Scala不支持三目运算符 , 在Scala 中使用 if – else 的方式实现
    if(a > b) {
      println(a)
    }else {
      println(b)
    }
  }
  */
  //2) 案例2：求三个数的最大值
  def main(args: Array[String]): Unit = {
    var a = 50
    var b = 40
    var c = 30
    var max = a

    if (a >= b && a >= c) {
      max = a
    } else if (b >= a && b >= c) {
      max = b
    } else {
      max = c
    }


    println(max)
  }

}
