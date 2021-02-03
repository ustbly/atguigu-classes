package chapter060708

object Scala14_Trait1 {
  def main(args: Array[String]): Unit = {
    // java中的接口无法直接构建对象,必须使用实现类
    // java中的接口是可以声明方法的,早期版本中声明的方法都是抽象的,新版本的是可以有默认实现的
    // java中的接口是可以声明属性的,属性值无法修改

    // scala中的特质也无法创建对象
    // scala中的特质是可以执行代码的
    var user14 = new User14
    // scala特质中声明的属性和方法都可以在混入的类中调用
    println(user14.username)
    user14.test()
    user14.test1()
  }
}
//声明特质
trait TestTrait14 {
  println("特质中的代码被执行了！")
  var username: String = "zhangsan"

  def test(): Unit = {
    println("test...")
  }

  // 特质中可以声明抽象方法
  def test1()
}



class Person14 {

}

class User14 extends Person14 with TestTrait14 {
  override def test1(): Unit = {
    println("111111")
  }
}