package chapter10

object Scala06_Tuple {
  def main(args: Array[String]): Unit = {

    //Tuple:元组
    //Map(k -> v)
    //将无关的数组当成一个整体来使用
    //empid,email,ordernum
    //使用小括号将数据关联在一起，形成一个整体
    //元组中最多的元素个数为22个
    val tuple: (Int, String, String) = (11, "xxxx", "张三")
    //访问元组中的数据，调用相应的数据编号：_顺序号
//    println(tuple._1)
//    println(tuple._2)
//    println(tuple._3)

    //循环遍历
    /*for (elem <- tuple.productIterator) {
      println(elem)
    }*/

    //如果元组中的元素个数为2，那么称之为对偶，类似于Map中的键值对
    val tuple1: (Int, String) = (1, "张三")
    val tupleMap: Map[Int, String] = Map((1, "张三"), (2, "李四"))

    //遍历方式1
    for (elem <- tupleMap) {
      println(elem._1 + "=" + elem._2)
    }
    println("===============")

    //遍历方式2
    tupleMap.foreach(t=>println(t._1 + "=" + t._2))

  }
}
