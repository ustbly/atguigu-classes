package chapter03.exer

/*
  1) 假如还有97天放假，问：xx个星期零xx天
 */
object Operator_Exer1 {
  def main(args: Array[String]): Unit = {
    var days = 97;
    var week = days / 7;
    var day = days % 7;
    println(week + "个星期零" + day + "天")
  }
}
