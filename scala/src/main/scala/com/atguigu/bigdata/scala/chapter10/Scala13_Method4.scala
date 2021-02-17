package chapter10

import scala.collection.mutable

object Scala13_Method4 {
  def main(args: Array[String]): Unit = {
    // 将两个Map进行合并,相同的key做累加,不同的key直接增加
    // a->4,b->2,c->5,d->1

    // map.get(key)==null, v
    // map.get(key) != null , map.get(key) + v
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 3, "c" -> 2, "d" -> 1)
    //foldLeft第一个参数就是集合外的那个部分，可以是值也可以是个集合
    //foldLeft第二个参数就是返回的map和循环遍历那个集合的元组
    val stringToInt: mutable.Map[String, Int] = map1.foldLeft(map2)((map2,t) => {
      map2(t._1) = map2.getOrElse(t._1,0) + t._2
      map2
    })

    println(stringToInt.mkString(","))

  }
}
