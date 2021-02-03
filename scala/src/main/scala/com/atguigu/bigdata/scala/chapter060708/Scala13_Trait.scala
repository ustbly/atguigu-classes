package chapter060708
// 接口
// scala中没有接口的概念,有特质(trait)的概念,类似于接口
object Scala13_Trait {
  def main(args: Array[String]): Unit = {
    var user = new User
    println(user)
  }
}

//声明特质
trait TestTrait1 {

}

trait TestTrait2 {

}

class Person13 {

}
// 特质可以继承的,不是实现,所以使用extends关键字
// 如果类继承多个特质,采用with连接
// 如果类同时存在父类和特质,依然采用继承方式,但是继承的是父类,连接(混入)特质
class User13 extends Person13 with TestTrait1 with TestTrait2 {

}