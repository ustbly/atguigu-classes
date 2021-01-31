package chapter04

object Scala03_For {
  def main(args: Array[String]): Unit = {
    //循环方式1
    /**
     * 说明
     * 1) i 表示循环的变量， <- 规定好 to 规定
     * 2) i 将会从 1-3 循环， 前后闭合
     */
    for(i <- 1 to 3){
      print(i + " ")
    }

    println()

    //循环方式2
    /**
     * 1) 这种方式和前面的区别在于 i 是从1 到 3-1
     * 2) 前闭合后开的范围,和java的arr.length() 类似
     */
    // 1. until(3) == 1 until 3
    // 2. 0.to(5) == 0 to 5
    for(i <- 1 until 3) {
      print(i + " ")
    }

    println()

    //循环守卫
    /**
     * 1) 循环守卫，即循环保护式（也称条件判断式，守卫）。保护式为true则进入
     *    循环体内部，为false则跳过，类似于continue
     * 2) 上面的代码等价
     */
    for (i <- 1 to 3) {
      if (i != 2) {
        print(i + " ")
      }
    }
  }
}
