package chapter03

import scala.io.StdIn

object Scala02_StdIn {
  def main(args: Array[String]): Unit = {
    println("请输入您的姓名：")
    var name = StdIn.readLine();

    println("请输入年龄：")
    var age = StdIn.readInt()


    println(name)
    println(age)
  }
}
