package chapter05

object Scala01_Function {
  def main(args: Array[String]): Unit = {
    //函数式编程

    //编程的范式

    //面向对象：解决问题时，将问题拆解成一个个小问题（形成了对象），分别解决
    //对象之间的关系：继承，实现，重写，多态

    //函数式编程关心的问题是问题的解决方案（封装功能）：重点在于函数（功能）、函数的入参、出参（返回值）

    //函数式编程重要的就是函数

    //TODO Java中的方法和Scala中的函数都可以进行功能的封装，但是方法必须和类型绑定，但是函数不需要


    //声明函数
    //1.java方法声明
    /*
      public static void test(String s) {}
     */

    //2.scala函数的声明
    //TODO Scala语法非常灵活，在任意的语法中可以声明其他语法规则
    def test(str: String) : Unit = {
      //函数体
      println(str)
    }
    //调用函数
    test("hello")
  }
}
