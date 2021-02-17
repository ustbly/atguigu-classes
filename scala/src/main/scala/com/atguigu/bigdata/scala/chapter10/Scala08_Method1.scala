package chapter10

object Scala08_Method1 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    // TODO filter :对集合的数据进行筛选过滤,true保留,false不保留
    val filterList: List[Int] = list.filter(x => x % 2 == 0)
    println(filterList)     //List(2, 4)

    // TODO 拉链 zip
    val list1: List[Int] = List(1, 2, 3, 5)
    val list2: List[Int] = List(4, 3, 7, 9)

    //求两个集合的并集
    val unionList: List[Int] = list1.union(list2)
    println(unionList)      //List(1, 2, 3, 5, 4, 3, 7, 9)

    //求两个集合的交集
    val intersectList: List[Int] = list1.intersect(list2)
    println(intersectList)  //List(3)

    //求两个集合的差集
    val diffList: List[Int] = list1.diff(list2)
    println(diffList)       //List(1, 2, 5)
  }
}
