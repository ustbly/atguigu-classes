package chapter10

import scala.collection.mutable.ArrayBuffer

object Scala14_ScalaAndJava {
  def main(args: Array[String]): Unit = {
    // TODO Scala集合和Java集合互相转换

    // ArrayBuffer ==> Java List
    val arr = ArrayBuffer("1", "2", "3")

    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    val arrList = javaArr.command()

    println("Java List ==> " + arrList)

    // TODO java.util.List ==> ArrayBuffer
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable

    val scalaArr: mutable.Buffer[String] = arrList

    scalaArr.append("jack")
    println("ArrayBuffer ==> " + scalaArr)
  }
}
