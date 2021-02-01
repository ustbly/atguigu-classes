package chapter05

object Scala07_RevFunction {
  def main(args: Array[String]): Unit = {

    def f = "rev";

    //等价于下面：
    def ff: String = {
      "rev"
    }

    println(f)
    println(ff)


    // TODO function类型最大为22
    val f0 = () => {}
    val f1 = (x: Int) => {}
    val f2 = (x: Int, y: Int) => {}
    // f0属于function类型,后面的数字表示参数个数,最大为22
    println(f0) // <function0>
    println(f1) // <function1>
    println(f2) // <function2>
  }
}
