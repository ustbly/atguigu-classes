package com.atguigu.bigdata.scala.chapter02
/*
  数据类型
 */
object Scala02_DataType {
  def main(args: Array[String]): Unit = {
    //Scala是完全面向对象的语言，所以没有基本数据类型
    //Scala中数字也是对象，也可以调用方法
    val age : Int = 20

    //数据类型分为值类型和引用类型
    val b : Byte = 10;
    val s : Short = 10;
    val i : Int = 10;
    val c : Char = 'c';
    val l : Long = 10;
    val f : Float = 10f;
    val d : Double = 10;
    val bln : Boolean = true;


    val ii : Integer = 10;
  }
}
