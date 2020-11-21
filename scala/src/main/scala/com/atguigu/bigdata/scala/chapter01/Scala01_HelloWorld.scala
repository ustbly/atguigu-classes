package com.atguigu.bigdata.scala.chapter01

object Scala01_HelloWorld {
  //Scala源码中包含了main方法，在编译后自动生成了public static void main
  //Scala在编译源码时会生成两个字节码文件，静态main方法执行另外一个字节码文件的成员main方法
  //Scala是完全面向对象的语言，那么没有静态的语法，只能通过模拟生成静态的方法
  //编译时将当前类生成一个特殊的类 ==> Scala01_HelloWorld$，然后创建对象来调用这个对象的main方法

  //一般情况下，将加$的类的对象，称之为“伴生对象”
  //伴生对象中的内容，都可以通过类名访问，来模拟Java中的静态语法

  //伴生对象的语法规则，使用object声明

  //public static void main(String[] arrays){方法体}

  //Scala中没有public关键字，默认所有访问权限都是公共的。

  //Scala中没有void关键字，采用特殊的对象模拟：Unit

  //Scala中声明方法采用关键字def

  //方法后面的小括号是方法的参数列表

  //Scala中参数列表的声明方式和Java不一样

  //Java：String 参数名
  //Scala：参数名 : 类型

  //Java方法的声明和方法体直接连接，Scala中方法声明和方法体是通过等号连接的

  //Scala将方法的返回值类型放在方法声明的后面使用冒号连接
  //Scala能省则省，尽量一行一条语句
    def main(args : Array[String]) : Unit = {
      println("Hello World");
      printf("你好世界")
    }
}
