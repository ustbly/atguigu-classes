package com.atguigu.bigdata.scala.chapter02

object Scala01_Var_1 {
  def main(args: Array[String]): Unit = {
    //能省则省
    //类型推断：Scala为了让开发过程变得简单，可以将自动推断出来的内容省略
    val name = "lisi"

    //    name = true 类型确定后，就不能修改，说明Scala 是强数据类型语言.
    val i = 1 + 1

    println(name)

    val dog = new Dog()
    dog.name = "tom"
    println(dog.name)

    //    dog = new Dog()
  }
}

class Dog {
  var name = ""
}
