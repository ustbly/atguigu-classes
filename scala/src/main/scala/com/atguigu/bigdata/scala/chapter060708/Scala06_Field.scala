package chapter060708

import scala.beans.BeanProperty

object Scala06_Field {
  def main(args: Array[String]): Unit = {
    var user: User06 = new User06
    //setter
    user.name = "张三"
    //getter
    println(user.name)

    //user.age  访问不到age属性

    println(user.email)

  }
}

// TODO Scala中也有四种访问权限
// 1) public 2) protected 3) default(package)  4) private
// public是默认的访问权限,没有关键字
// protected 访问权限只能子类访问,同包访问不了
// private 私有访问权限,只能当前类访问,  只在类的内部和伴生对象中可用
// 包访问权限需要采用特殊的语法规则  : private[包名]
// 增加包访问权限后，1.private同时起作用。不仅同类可以使用 2.同时同一个包下其他类也可以使用

// scala设计者将访问的方式分成三大类(1) 处处可以访问public (2) 子类和伴生对象能访问protected (3) 本类和伴生对象访问 private

package p1 {
  package p2 {

    class UserP2 {
      var username = "zhangsan"
      protected var age = 20 //子类能访问
      private var sex = 0 //当前类UserP2能访问
      //private[p2] var email = "@xx.com" //当前包p2能访问
      //private[p3] var email = "@xx.com" //当前包p3能访问
    }

  }

  package p3 {

    import chapter060708.p1.p2.UserP2

    class EmpP3 extends UserP2 {
      def test_Access() = {
        var user = new UserP2
        println(user.username)
        //println(user.email)
        //println(user.age)
      }
    }

  }

}


class User06 {
  //声明属性
  //Scala中给类声明属性，默认为私有的，但是底层提供了公有的setter和getter方法
  var name: String = _

  //如果给属性增加private修饰符，那么属性无法在外部访问，因为底层生成的getter和setter方法是私有的
  private var age: Int = _

  //如果声明的属性使用val，那么属性是私有的，并且用final修饰，底层只提供getter方法，而没有setter方法
  val email: String = "zhangsan@163.com"

  // 为了和java bean规范统一,scala提供了注解,生成java中对应set,get方法
  // 将Scala字段加@BeanProperty时,这样会自动生成规范的setXxx/getXxx方法,这时可以使用对象.setXxx()和对象.getXxx()来调用属性
  @BeanProperty var address: String = _
}