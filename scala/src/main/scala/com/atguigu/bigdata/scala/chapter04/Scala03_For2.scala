package chapter04

object Scala03_For2 {
  def main(args: Array[String]): Unit = {
    /**
     * 循环返回值
     * 将遍历过程中处理的结果返回到一个新Vector集合中，使用yield关键字
     */

    val res = for(i <- 1 to 10) yield i
    println(res)

    /**
     * 使用花括号{}代替小括号()
     */
    //1) {}和()对于for表达式来说都可以
    //2) for 推导式有一个不成文的约定：当for 推导式仅包含单一表达式时使用圆括号，当其
    //   包含多个表达式时使用大括号
    //3) 当使用{} 来换行写表达式时，分号就不用写了

    for{
      i <- 1 to 3
      j = i * 2
    } {
      println(" i= " + i + " j= " + j)
    }

    println("====================")

    /**
     * scala 的for循环的步长如何控制? [for(i <- Range(1,3,2)]
     * Range(int start,int end,int step)：包含开始不包含结尾，步长为step
     */
    for(i <- Range(1,9,2)) {
      print(i + " ")  //1 3 5 7
    }
  }
}
