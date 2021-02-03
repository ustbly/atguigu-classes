package chapter060708

// 面向对象
// TODO Scala是一个完全面向对象的语言

object Scala02_ObjectDemo {
  def main(args: Array[String]): Unit = {
    // 创建类的对象
    var user : User = new User();

    // 调用对象的属性或方法
    user.name = "zhangsan"
    user.age = 18

    println(user.name + " : " + user.age)
    println(s"${user.name} : ${user.age}")
  }
}

// 声明类
class User {
  // 类的主体内容 ==> 类体

  // 声明属性
  // 1) Scala中声明一个属性,必须显式的初始化，然后根据初始化数据的类型自动推断，属性类型可以省略(这点和Java不同)
  // 2) 如果赋值为null,则一定要加类型，因为不加类型, 那么该属性的类型就是Null类型.
  // 3) 如果在定义属性时，暂时不赋值，也可以使用符号_(下划线)，让系统分配默认值.

  var name:String = _
  var age : Int = _

  def login():Boolean = {
    true
  }
}
