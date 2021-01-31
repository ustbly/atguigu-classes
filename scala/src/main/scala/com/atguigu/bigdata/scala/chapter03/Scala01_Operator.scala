package chapter03

object Scala01_Operator {
  def main(args: Array[String]): Unit = {
  //    案例演示算术运算符的使用(Operator.scala)。
  //    1) +, - ,/ , % 重点讲解 /、%
  //    2) +、-、* 是一个道理，完全可以类推。
  //    3) 算数运算符的运算规则和Java一样
    var r1 : Int = 10 / 3
    println("r1=" + r1)
    var r2 : Double = 10 / 3
    println("r2=" + r2)
    var r3 : Double = 10.0 / 3
    println("r3=" + r3 )
    println("r3=" + r3.formatted("%.2f") ) //格式化double值，保留小数点后两位
    //Scala中没有++、--操作符，需要通过+=、-=来实现同样的效果

    //println(r1++) //value ++ is not a member of Int
    r1+=1
    println(r1)
  }
}
