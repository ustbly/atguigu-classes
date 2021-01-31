package chapter04

object Scala01_Branch {
  def main(args: Array[String]): Unit = {
    //单分支
    val age = 20
    if (age > 18) {
      println("age > 18")
    }

    //双分支
    var age1 = 15
    if (age1 > 18) {
      println("age1 > 18")
    } else {
      println("age1 <= 18")
    }

    //多分支
    var s = "abc"
    if (s.equals("abc")) {
      println("abc")
    } else if (s.equals("cde")) {
      println("cde")
    } else {
      println("others")
    }
  }

}
