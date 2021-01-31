package chapter03.exer

/*
  2) 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：C=5×(F−32)/9,
     请求出华氏温度对应的摄氏温度。[测试：150]
 */
object Operator_Exer2 {
  def main(args: Array[String]): Unit = {
    var huashi = 150
    var sheshi = 5*(huashi-32).toDouble/9
    println(sheshi)
  }
}
