package chapter12

import scala.util.control.Breaks

object Scala02_AbstractFunction {
  def main(args: Array[String]): Unit = {
    /*
    Breaks.breakable{

      for() {
        Breaks.break
      }
    }
    */

    // 函数作为参数传递给另一个函数,如果这个函数不需要参数,也不需要返回值,那么可以直接传递代码逻辑
    // 声明方式 =>Unit
    //def test(f:() => Unit): Unit = {
    def test(f: => Unit): Unit = {
      f
    }

    test {
      println("xxxx")
    }


    // TODO 进阶用法：实现类似while的until函数
    var x = 10

    def until(condition: => Boolean)(block: => Unit): Unit = {
      //类似while循环，递归
      if (condition) {
        block
        until(condition)(block)
      }
      //      println("x=" + x)
      //      println(condition)
      //      block
      //      println("x=" + x)
    }

    until(x > 0) {
      x -= 1
      println("x=" + x)
    }

    /*
    def myRunInThread(f1: () => Unit) = {
      //def myRunInThread(f1: => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1()
        }
      }.start()
    }
    myRunInThread {
      () => // 可以省略这行
        println("干活咯！5秒完成...")
        Thread.sleep(5000)
        println("干完咯！")
    }
    */

    // 简洁版
    def myRunInThread(f1: => Unit) = { // 简化版,省略()
      new Thread {
        override def run(): Unit = {
          f1 // 简化版,省略()
        }
      }.start()
    }

    myRunInThread {
      println("干活咯！5秒完成...")
      Thread.sleep(5000)
      println("干完咯！")
    }
  }
}
