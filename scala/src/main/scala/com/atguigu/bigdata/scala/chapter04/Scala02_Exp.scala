package chapter04

/**
 * Scala中任意表达式都是有返回值的，也就意味着if else表达式其实是有返回结果
 * 的，具体返回结果的值取决于满足条件的代码体的最后一行内容
 */
object Scala02_Exp {
  def main(args: Array[String]): Unit = {
    var flag = true

    //true:Unit     false:String
    val value = if (flag) {
      "true"
      println("abc")
    } else {
      "false"
    }

    println(value)


    //Scala中是没有三元运算符，因为可以这样简写
    var b = if (flag == true) "true" else "false"
    println(b)
  }
}
