package chapter060708
// Scala会自动导入scala包中的类
object Scala20_ClassInfo1 {
  def main(args: Array[String]): Unit = {
    println("zhangsan...")
    println(Color.RED)
  }
}

// 枚举
object Color extends Enumeration {
  // 隐式转换
  var RED = Value(1, "red")
  var YELLOW = Value(2, "yellow")
}