package com.atguigu.bigdata.scala.chapter02

object Scala01_Var {

  //在方法外部声明的变量如果采用val关键字，等同于使用final修饰
  val sex : String = "男"
  def main(args: Array[String]): Unit = {
    //Java局部变量
    //int i = 10;
    //Scala声明变量
    //var 变量名称 : 变量类型 = 变量值
    var name : String = "zhangsan"

    //Scala声明变量必须显式地初始化
//    var name : String
//    name = "zhangsan"

    //使用var声明的变量的值是可以修改的
    var age : Int = 3
    age = 20
//    var d : Double = 1.0
//    var c : Char = 'C'
//    var b : Boolean = true

    //使用val声明的变量的值无法修改
//    val name1 : String = "lisi"
//    name1 = "wangwu"
  }
}
