package chapter02

object Scala03_Name {
  def main(args: Array[String]): Unit = {
    //标识符
    //Scala中可以使用特殊符号作为标识符，其实是将特殊符号在编译时进行了转换
    //但是一般特殊符号和特殊符号结合使用，特殊符号和数字或者下划线结合就可能出现错误
    val +- = "123";

    val %@ = true;

    val _ = "abc";  //scala中的下划线有特殊的用途，不能独立当成变量名来使用
    val s = "123" + _;

    println(+-)
    println(%@)
    println(s)    //<function1>

    //用``括起来的关键字也可以使用
    val `private` = "abcd";
    println( `private`)

    val Int = 456;
    println(Int)
  }
}
