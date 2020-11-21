package com.atguigu.bigdata.scala.chapter01

//打印字符串
object Scala02_StringPrint {
  def main(args: Array[String]): Unit = {
    println("打印测试")

    //变量
    val name = "ApacheCN"
    val age = 1
    val url = "www.atguigu.com"

    //1.字符串通过+号连接（类似java）
    println("name = " + name + ",age = " + age + ",url = " + url)

    //2.printf用法 （类似C语言）字符串通过 % 传值
    printf("name = %s,age = %d,url = %s\n", name, age, url)

    //3.字符串通过$引用(类似JSTL）
    println(s"name = ${name},age = ${age},url = ${url}")
    //3.1 格式化特定参数
    println(f"name = ${name},age = ${age}%.2f,url = ${url}")
    //3.2 显示原始值
    print(raw"name = ${name},age = ${age}%.2f,url = ${url}\n")

    //单行注释

    /*
      多行注释
     */

    /**
      * doc注释
      */

    //ctrl + alt + L 格式化代码
  }
}
