package chapter10

object Scala09_WordCount {
  def main(args: Array[String]): Unit = {
    val lineList: List[(String, Int)] = List(("Hello Scala World", 4), ("Hello World", 3), ("Hello Hadoop", 2), ("Hello Hbase", 1))
    // 1.将一行行的数据拆分成一个个单词数据
    // ("Hello Scala World",4)
    // => [(Hello),(Scala),(World)]
    // => [(Hello,4),(Scala,4),(World,4)]
    val flatMapList: List[(String, Int)] = lineList.flatMap(t => {
      val words: Array[String] = t._1.split(" ")
      words.map(s => (s, t._2))
    })

    println(flatMapList)

    // 将单词进行分组
    // Hello -> List((Hello,4), (Hello,3), (Hello,2), (Hello,1))
    // ==> List((4),(3),(2),(1))
    // ==> list.sum
    val groupByMap: Map[String, List[(String, Int)]] = flatMapList.groupBy(t => {
      t._1
    })

    println(groupByMap)

    val map: Map[String, Int] = groupByMap.map(t => {
      var cnt = 0
      for (elem <- t._2) {
        cnt += elem._2
      }
      (t._1, cnt)
    })
    println(map)

    val sumList: List[(String, Int)] = map.toList
    println(sumList)

    val sortedList: List[(String, Int)] = sumList.sortWith((t1, t2) => {
      t1._2 > t2._2
    })
    println(sortedList)
    // 从排序后的集合中获取前3条
    val resList: List[(String, Int)] = sortedList.take(3)
    println(resList.mkString(","))
/*
    // 将一行行的数据拆分成一个个单词数据
    // ("Hello Scala World",4)
    // => [(Hello),(Scala),(World)]
    // => [(Hello,4),(Scala,4),(World,4)]
    val flatMapList: List[(String, Int)] = linesList.flatMap(t => {
      val line: String = t._1
      val words: Array[String] = line.split(" ")
      words.map(w => (w, t._2))
    })

    // 将单词进行分组
    // Hello -> List((Hello,4), (Hello,3), (Hello,2), (Hello,1))
    // ==> List((4),(3),(2),(1))
    // ==> list.sum
    val groupWordMap: Map[String, List[(String, Int)]] = flatMapList.groupBy(t => t._1)

    // 将分组后的数据进行结构的转换
    /*
    val wordToSumMap: Map[String, Int] = groupWordMap.map(t => {
      val countList: List[Int] = t._2.map(tt => tt._2)
      (t._1, countList.sum)
    })
    */

    // TODO mapValues方法可以只针对于Map集合中的Value做操作,key保持不变
    val wordToSumMap: Map[String, Int] = groupWordMap.mapValues(datas => datas.map(tt => tt._2).sum)

    // 将统计的结果进行降序排列
    val sortList: List[(String, Int)] = wordToSumMap.toList.sortWith((left, right) => {
      left._2 > right._2
    })

    // 从排序后的集合中获取前3条
    val resultList: List[(String, Int)] = sortList.take(3)

    println(resultList)*/
  }
}
