package chapter05

object Scala02_Function1 {
  def main(args: Array[String]): Unit = {
    //函数：入参（方法参数）、出参（返回值）

    //1.无参、无返回值
    def test() : Unit = {
      println("hello world")
    }
    //调用方法
    test()

    //2.有参、无返回值
    //函数没有重载的概念
    //如果在同一个作用域中，函数不能同名
    def test1(string: String) : Unit = {
      println(string)
    }
    //调用方法
    test1("linyue")

    //3.有参，有返回值
    def test2(string: String) : String = {
      return string + "haha"
    }

    val returnVal = test2("zhangsan")
    println(returnVal)

    //4.无参，有返回值
    def test4() : String = {
      return "aabb"
    }

    var string = test4();
    println(string)

    //scala中没有throws关键字，所以函数中如果有异常发生，也不需要在函数声明时抛出异常
  }
}
