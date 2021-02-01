package chapter05

object Scala04_FunctionStrengthen {
  def main(args: Array[String]): Unit = {
    //TODO 函数式编程 —— 扩展
    //1.可变参数
    def test(string: String*): Unit = {
      println(string)
    }

    //调用函数时，可传多个参数，也可以不传参数
    //test("zhangsan","lisi","wangwu")  //WrappedArray(zhangsan, lisi, wangwu)
    //test()    //List()


    //2.默认参数
    //如果希望函数中的某一个参数使用默认值，那么可以在声明时直接赋初值
    def test1(name: String, age: Int = 20): Unit = {
      println(name + "--" + age)
    }

    test1("林跃")
    test1("林跃", 22)

    def test2(name1: String = "zhangsan", name2: String): Unit = {
      println(name1 + "--" + name2)
    }
    //调用函数时，参数匹配规则是从前到后，从左到右
    test2("wangwu", "lisi")
    //带名参数
    test2(name1 = "王五", "lisi")
  }
}
