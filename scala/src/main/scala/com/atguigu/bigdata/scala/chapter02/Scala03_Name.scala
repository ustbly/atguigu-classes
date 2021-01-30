package chapter02

object Scala03_Name {
  def main(args: Array[String]): Unit = {
    //标识符
    //Scala中可以使用特殊符号作为标识符，其实是将特殊符号在编译市进行了转换
    val +- = "123";

    print(+-)
  }
}
