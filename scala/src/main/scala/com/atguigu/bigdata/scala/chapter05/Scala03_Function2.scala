package chapter05

object Scala03_Function2 {
  def main(args: Array[String]): Unit = {
    //TODO Scala可以采用自动推断功能来简化函数的声明
    //1）如果函数声明时，明确无返回值Unit，那么即使函数体中有return也不起作用
    /*def test() : Unit = {
      //println("hello world!")
      return "zhanshan"
    }*/


    //如果将函数最后一行代码进行返回，那么return关键字可以省略
  /*  def test() : String = {
      //return "zhanshan"
      "zhangsan"
      //println("hello")
    }*/

    //如果根据函数的最后一行代码推断类型，那么函数返回值可以省略
    /*def test()  = {
      //return "zhanshan"
      "zhangsan"
      //println("hello")
    }*/

    //如果函数体中只有一行代码，大括号也可以省略
    /*def test() = "zhangsan"
    println(test())*/

    //如果函数声明没有参数列表，小括号也可以省略
/*    def test = "lisi"
    println(test)*/

    //如果明确函数中没有返回值，那么等号可以省略，省略后函数体中的最后一行代码不会作为返回值
    //如果函数没有参数列表，可以省略小括号，调用时一定不能使用小括号
    //如果函数没有参数列表，但是没有省略小括号，调用时小括号可加可不加
    /*def test{
      "lisiwangwu"
//      println("fsfklsd")
    }*/


//    def test = 1
//    println(test)

    //匿名函数
    () -> {println("hello,xxx")}

  }
}
