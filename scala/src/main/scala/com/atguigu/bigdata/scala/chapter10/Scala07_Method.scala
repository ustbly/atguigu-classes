package chapter10

import scala.collection.mutable

object Scala07_Method {
  def main(args: Array[String]): Unit = {
    // TODO 集合常用的方法
    val list = List(1, 2, 4, 3, 1, 3)


    // TODO 求和
    println("sum = " + list.sum)
    // TODO 最大值
    println("max = " + list.max)
    // TODO 最小值
    println("min = " + list.min)
    // TODO 乘积
    println("product = " + list.product)
    // TODO 反转（无排序）
    println("reverse = " + list.reverse)
    // TODO 分组（通过指定函数的返回值进行分组）
    /*val intToList: Map[Int, List[Int]] = list.groupBy(x => x)
    for (elem <- intToList) {
      println(elem._1 + "  " + elem._2)
    }*/

    //根据奇数偶数
    val booleanToList: Map[Boolean, List[Int]] = list.groupBy(x => x % 2 == 0)
    for (elem <- booleanToList) {
      println(elem._1 + " : " + elem._2)
    }


    //根据字符串首字符分组
    val stringList: List[String] = List("11", "13", "22", "24")
    /*val map: Map[Char, List[String]] = stringList.groupBy(s => {
      s.charAt(0)   //s.substring(0,1)也可以
    })

    for (elem <- map) {
      println(elem._1 + " : " + elem._2)
    }*/

    // TODO 排序（按照指定规则排序）
    /*val ints: List[Int] = list.sortBy(x => x)
    ints.foreach(println)*/

    /*
    val strings: List[String] = stringList.sortBy(s => {
      s.charAt(1)
    })

    strings.foreach(println)*/

    // TODO 排序（升序、降序）
    // 升序 小 => 大
    /*val strings1: List[String] = stringList.sortWith((left, right) => {
      left.charAt(1).toInt < right.charAt(1).toInt
    })*/
    //降序 大 => 小
    val strings1: List[String] = stringList.sortWith((left, right) => {
      left.charAt(1).toInt > right.charAt(1).toInt
    })

    strings1.foreach(println)

    // TODO 迭代
    for (elem <- list.iterator) {
      println(elem)
    }

    //获取集合前n个
    //list.take(10)

    // TODO 映射（转换）
    //将指定的数据结构转化为其他的数据结构
    /*
    val tuples: List[(Int, Int)] = list.map(x => {
      (x, 1)
    })

    for (elem <- tuples) {
      print(elem + " ")
    }

    println()

    val intToTuples: Map[Int, List[(Int, Int)]] = tuples.groupBy((t) => {
      t._1
    })
    println(intToTuples.mkString(","))

    val intToInt: Map[Int, Int] = intToTuples.map(t => {
      (t._1, t._2.size)
    })

    println(intToInt.mkString(","))
    */

    // TODO　WordCount
    //对集合中的单词字符串进行统计出现的次数，并且按照出现次数进行降序排列，取前三名

    val wordList = List("Hello", "Scala", "Hello", "World", "Hbase", "Hadoop", "Kafka", "Scala", "World")
    /* 自己的思路 */
    /* //1.先把List映射变成Tuple
    val wordTuples: List[(String, Int)] = wordList.map(t => (t, 1))

    for (elem <- wordTuples) {
      println(elem)
    }
    println("=================")
    //2.把相同键的元素分组
    val wordMaps: Map[String, List[(String, Int)]] = wordTuples.groupBy(t => {
      t._1
    })

    for (elem <- wordMaps) {
      println(elem)
    }
    println("=================")
    //3.按照键和值的尺寸进行映射
    val resMap: Map[String, Int] = wordMaps.map(t => (t._1, t._2.size))
    for (elem <- resMap) {
      println(elem)
    }
    //4.把map转为list进行对值的排序
    val mapToList: List[(String, Int)] = resMap.toList
    //5.根据值的大小取出降序后的前三名
    val tuple_Desc: List[(String, Int)] = mapToList.sortWith((t1, t2) => {
      t1._2 > t2._2
    }).take(3)
    println("=================")
    println(tuple_Desc.mkString(","))*/
    /* 课程思路 */
    /*// 1.将相同的单词放置在一起(分组)
    val wordToList: Map[String, List[String]] = wordList.groupBy(word => word)
    // 2.将数据结构进行转换
    val wordToCountMap: Map[String, Int] = wordToList.map(t => {
      (t._1, t._2.size)
    })
    // 3.将数据进行排序(降序)
    // map无序,需要转成list
    // List((k1,v1),(k2,v2))
    val sortWordList = wordToCountMap.toList.sortWith((left, right) => {
      left._2 > right._2
    })
    // 4.取排序完成后的前3条数据
    val resultList: List[(String, Int)] = sortWordList.take(3)
    println(resultList.mkString(","))*/

    // TODO 扁平化操作
    val lineList = List("Hello World", "Hello Scala", "Hello Hadoop")
    val resList: List[(String, Int)] = lineList.
                                      flatMap(s => s.split(" ")).
                                      groupBy(s => s).
                                      toList.
                                      map(t => (t._1, t._2.size))
    println(resList.mkString(","))



    /*
    list.reduce()
    list.fold()
    list.filter()
    */
  }
}
