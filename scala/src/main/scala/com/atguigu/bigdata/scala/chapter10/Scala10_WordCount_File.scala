package chapter10

import scala.io.Source

/**
 * 从文件中读取单词，进行WordCount
 */
object Scala10_WordCount_File {
  def main(args: Array[String]): Unit = {
    // 从文件中获取数据
    val lineList: List[String] = Source.fromFile("in\\word.txt").getLines().toList
    // 将文件中的数据进行扁平化操作
    val flatMapList: List[String] = lineList.flatMap(s => s.split(" "))
    // 按单词进行分组
    val groupByMap: Map[String, List[String]] = flatMapList.groupBy(word => word)
    // 把数据结构转换为单词和次数的map映射
    val wordMap: Map[String, Int] = groupByMap.map(t => {
      (t._1, t._2.size)
    })
    // 按照出现次数进行降序排序
    val resList: List[(String, Int)] = wordMap.toList.sortWith((t1, t2) => {
      t1._2 > t2._2
    })


    // 打印结果
    println(resList.mkString(","))

  }
}
