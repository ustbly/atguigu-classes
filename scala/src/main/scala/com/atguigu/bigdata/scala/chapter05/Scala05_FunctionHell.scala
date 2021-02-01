package chapter05

object Scala05_FunctionHell {
  def main(args: Array[String]): Unit = {
    //函数值编程——地狱
    //TODO Scala是完全面向函数式编程的语言

    // 函数在Scala中可以做任何事情
    // 函数可以赋值给变量
    // 函数可以作为函数的参数
    // 函数可以作为函数的返回值

    /*
      def f(): Unit = {
        println("function")
      }

      def f0() = {
        //返回函数
        //直接返回函数，有问题，需要增加特殊符号:下划线 _
        f _
      }

      f0()()  //f0()相当于接收了f这个函数，但并没有调用，f0()()相当于接收并调用了f函数，所以会输出
      */


    def ff(i: Int): Unit = {
      println(i)
    }

    def fff() = {
      // ff(3) //不写下划线就需要传入参数,返回的是函数结果
      ff _ //写下划线就表示调用的是ff这个函数本身
    }

    fff()(3)


    //上述代码可以简化为下面：
    /*def f1(i : Int) = {
      def f2(j : Int): Int = {
//        println("xxxx")
        i * j
      }

      f2 _
    }

    println(f1(2)(3))
    */

    // TODO 函数柯里化
    /*
       柯里化指的是将原来接受多个参数的函数变成新的接受一个参数的函数的过程,新函数的参数接受原来的第二个参数为唯一参数,
       如果有n个参数, 就是把这个函数分解成n个新函数的过程
    */
    // 1) 函数编程中，接受多个参数的函数都可以转化为接受单个参数的函数，这个转化过程就叫柯里化
    // 2) 柯里化就是证明了函数只需要一个参数而已。其实我们刚才的学习过程中，已经涉及到了柯里化操作。
    // 3) 不用设立柯里化存在的意义这样的命题。柯里化就是以函数为主体这种思想发展的必然产生的结果。(即：柯里化是面向函数思想的必然产生结果)
    // 传统方式, 函数/方法(变量)， 对象.方法(变量)
    // 集合.函数(函数).函数(函数).函数(函数)


    /*
     def f3(i:Int)(j:Int): Int = {
       i * j
     }

     println(f3(2)(3))
    */
    /*

        // 原始函数, 有3个参数的函数
        //def addMulti(a: Int, b: Int, c: Int) = (a + b) * c

        // 函数A的返回值是一个函数B, 函数B的返回值是函数C
        def addMulti(a: Int) = {
          (b: Int) => (c: Int) => (a + b) * c
        }

        println(addMulti(50)(80)(20))
    */


    // TODO 闭包
    // 一个函数在实现逻辑时,将外部的变量引入到函数的内容,改变了这个变量的生命周期,称之为闭包
    /* def f1(i: Int) = {
       def f2(j: Int): Int = {
         //        println("xxxx")
         i * j
       }

       f2 _
     }

     val intToInt: (Int) => Int = f1(10)

     println(f1(2)(3))*/

    // TODO 将函数作为参数传递给另外一个函数,需要采用特殊的声明方式
    // ()=>Unit
    // 参数列表=>返回值类型
    /*
        def f4(f: () => Int): Int = {
          f() + 5
        }

        def f5(): Int = {
          10
        }

        println(f4(f5))*/


    // TODO 使用匿名函数改善代码
    /*    def f6(f: () => Unit): Unit = {
          f()
        }

        f6(() => {
          println("xxxxxxxx")
        })*/

    def f7(f: (Int, Int) => Int) = {
      f(10, 20)
    }

    /* def f8(i: Int, j: Int): Unit = {
       println(i + j)
     }*/

    /*f7(f8)
    f7((i:Int)=>{println(i)})
    f7((i)=>{println(i)})
    f7((i)=>println(i))
    f7(println(_))  //参数只用到了一次才能用下划线代替
    f7(println)*/

    //f7(f8)
    println(f7((x: Int, y: Int) => {
      (x + y)
    }))
    println(f7((x, y) => {
      (x + y)
    }))
    println(f7((x, y) => (x + y)))
    println(f7((_ + _)))
  }
}
