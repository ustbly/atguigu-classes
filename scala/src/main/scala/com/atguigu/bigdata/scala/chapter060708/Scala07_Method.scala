package chapter060708
/*
  类的方法
  所谓类的方法，就是类中声明的函数，所以声明方式和函数一样，调用方式上有区别
 */
object Scala07_Method {
  def main(args: Array[String]): Unit = {
    //创建对象
    var user = new User07
    user.login()
    //val str:String = user.+("zzz")
    //user + "xxx"
    //println(str)
  }
}


class User07 {
  //登录
  def login() = {

  }

  //登出
  //方法一般不简化
  def logout():Boolean = {
    true
  }
}
