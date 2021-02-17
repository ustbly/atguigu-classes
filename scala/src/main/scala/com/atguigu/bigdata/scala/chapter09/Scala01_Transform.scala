package chapter09

object Scala01_Transform {
  def main(args: Array[String]): Unit = {

    // 自动转换 - 隐式转换
    // scala默认的情况下支持数值类型的自动转换
    // byte -> short -> int -> long
    // scala默认的情况下支持多态语法中的类型自动转换
    // child -> parent -> trait(interface)

    // Scala也允许开发人员自定义类型转换规则
    // 将两个无关的类型通过编程手段让它们可以自动转换

    // 隐式转换的前提
    // 1) 不能存在二义性
    // 2) 隐式操作不能嵌套使用

    // 隐式转换函数是以implicit关键字声明的带有单个参数的函数。这种函数将会自动应用，将值从一种类型转换为另一种类型
    // 隐式转换函数的函数名可以是任意的，隐式转换与函数名称无关，只与函数签名（函数参数类型和返回值类型）有关。
    // 隐式函数可以有多个(即：隐式函数列表)，但是需要保证在当前环境下，只有一个隐式函数能被识别

    // 在当前环境中，不能存在满足条件的多个隐式函数
    implicit def transform(double: Double):Int  = {
      double.toInt
    }

    /*
    // OCP = Open Close 允许功能的扩展,不允许对之前的代码有修改,因为修改可能导致逻辑出现错误

    // 在相同的作用域内,不能含有多个相同类型的转换规则
    implicit def transform1(double: Double):Int  = {
      double.toInt
    }
    */

    var num : Int = 5.0// 在转换时，识别出有两个方法可以被使用，就不确定调用哪一个，所以出错

    println(num)

  }
}
