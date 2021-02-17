package chapter10

object Scala12_Method3 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    // TODO fold
    // fold函数将上一步返回的值作为函数的第一个参数继续传递参与运算，直到list中的所有元素被遍历。
    // 折叠,也可以对集合数据进行简化,获取最终的一条结果
    // fold方法可以传递两个部分的参数
    // 第一个部分表示集合之外的数据,第二个部分表示数据进行的逻辑处理
    //val i: Int = list.fold(100)(_ + _)// 110
    //val i: Int = list.fold(100)(_ - _) // 90
    //val i: Int = list.foldLeft(100)(_ - _) // 90

    //  reduceLeft就是调用的foldLeft[B](head)，并且是默认从集合的head元素开始操作的。
    // reverse.foldLeft(z)((right, left) => op(left, right))
    // reverse ==> 4,3,2,1
    // foldLeft ==> (((10-4)-3)-2)-1
    // foldRight ==> 1-(2-(3-(4-10)))
    // 4-10=-6 3-(-6)=9 2-9=-7 1-(-7)=8
    val i2: Int = list.foldRight(10)(_ - _) // 8
    println(i2)
  }
}
