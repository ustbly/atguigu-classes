package chapter060708

//类

object Scala10_Class {
  def main(args: Array[String]): Unit = {
    var user = new User10
    //user.test()
    user.test1() //child test1...

    val user1: Person = new User10
    user1.test1() //child test1...

    println(user.email)

  }
}

//声明类
//父类，继承
//类可以声明为抽象类 abstract
abstract class Person {
  var name: String = _
  //Scala中属性也可以重写，因为属性可以抽象
  //属性只有声明，而没有初始化，那么就是抽象属性
  //抽象属性在编译为class文件的时候，不产生属性，而是产生抽象的getter方法
  var sex: String

  val email: String = "zzzz"

  //声明抽象方法，方法只有声明，没有实现，不需要abstract关键字声明
  def test()

  def test1() = {
    println("parent test1...")
  }
}

class User10 extends Person {
  //重写抽象方法：补全方法
  def test(): Unit = {
    println("xxxxx")
  }

  //TODO 如果Scala中子类重写父类的方法（不是抽象方法），需要增加override关键字
  override def test1(): Unit = {
    println("child test1...")
  }

  //重写属性，补全属性
  var sex: String = "xxx"

  //属性可以被覆盖（重写），但是不能重写父类声明var的变量
  override val email: String = "yyyy"
}
