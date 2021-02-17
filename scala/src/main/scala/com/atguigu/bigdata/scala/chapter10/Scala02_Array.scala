package chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_Array {
  def main(args: Array[String]): Unit = {
    // java数组:int[] ints = new int[3]{1,2,3};
    //          ints[0] = 1;
    //          int i=ints[0];


    // TODO Scala中的数组(不可变),使用Array对象实现,使用中括号声明数组的类型
    // Array[String]
    // Scala可以使用简单的方式创建数组
    // Array可以通过apply方法来创建数组对象

    val ints: Array[Int] = Array(1, 2, 3, 4)
    // 访问数组 : 使用小括号,增加索引的方式来访问数组
    //println(ints(0))

    //数组长度
    //println(ints.length)

    //println(ints.+("linyue")) //[I@3cb5cdbalinyue

    //把数组转化为字符串打印出来
    //println(ints.mkString("|"))

    //将数组每个元素打印出来
    //第一种for循环
    /* for (i <- 0 until ints.length) {
       println(ints(i))
     }*/
    //第二种
    /* for (elem <- ints) {
       println(elem)
     }*/
    //第三种

    /*def printElem(i: Int): Unit = {
      println(i)
    }*/
    /*
        ints.foreach(printElem)
        ints.foreach((i:Int)=>{println(i)})
        ints.foreach((i)=>{println(i)})
        ints.foreach((i)=>println(i))
        ints.foreach(println(_))
        ints.foreach(println)*/

    //增加元素
    //采用方法向数组中增加新的元素，但是不会对原来的数组造成影响，而是产生新的数组
    val ints1: Array[Int] = ints :+ (5)
    val ints2: Array[Int] = 5 +: (ints)


    //    println(ints1.mkString(","))
    //println(ints2.mkString(","))
    //println(ints == ints1)

    //修改数据
    ints(0) = 8
    ints.update(1, 5)
    println(ints.mkString(","))

    //可变数组
    val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(5, 6, 7, 8)
    //查询元素
    //println(arrayBuffer(2))

    //修改元素
    //arrayBuffer(0) = 9
    //把数组转为字符串
    println(arrayBuffer.mkString("|"))
    //循环遍历值
    //arrayBuffer.foreach(println)

    //增加数据
    val buffer: arrayBuffer.type = arrayBuffer += (10)
    //println(buffer == arrayBuffer)

    //向指定索引添加元素
    //arrayBuffer.insert(1, 20)
    //arrayBuffer.foreach(println)

    //删除元素
    //arrayBuffer -= (7)                  //括号中是元素值
    //val i: Int = arrayBuffer.remove(1)  //括号中是元素索引值
    //返回的i是被删除的元素值
    //println("i = " + i)

    //第一个参数为开始索引，第二个为个数
    //val unit: Unit = arrayBuffer.remove(1, 3)
    arrayBuffer.foreach(println)

    //可变数组和不可变数组的转化
    //不可变数组 -> 可变数组
    val buffer1: mutable.Buffer[Int] = ints.toBuffer
    //可变数组 -> 不可变数组
    val array: Array[Int] = arrayBuffer.toArray
  }
}
