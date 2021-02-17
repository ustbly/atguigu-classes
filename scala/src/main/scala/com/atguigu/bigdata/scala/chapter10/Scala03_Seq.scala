package chapter10

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala03_Seq {
  def main(args: Array[String]): Unit = {
    //序列 Seq
    //默认Scala提供的集合都是不可变的（immutable）
    val list: List[Int] = List(1, 2, 3, 4)
    val list1: List[Int] = List(5, 6, 7, 8)

    //通过索引获取数据
    //println(list(0))

    //增加数据
    //val list1: List[Int] = list :+ 1  //1,2,3,4,1
    //val list1: List[Int] = 1 +: list  //1,1,2,3,4
    //println(list1.mkString(","))

    //println(list == list1)    //false

    //val list2: List[Int] = list.++(list1) //1,2,3,4,5,6,7,8
    //val list2: List[Int] = list ++ list1    //1,2,3,4,5,6,7,8
    //println(list2.mkString(","))

//    val list3: List[Int] = list.::(9)   //9,1,2,3,4

    //list中的冒号运算符的运算顺序从右到左
    //val list4: List[Int] = 7 :: 8 :: 9 :: list  //7,8,9,1,2,3,4
    //val list4: List[Int] = (7 :: (8 :: (9 :: list)))  //7,8,9,1,2,3,4

    /*
    val list5 = 9 :: list1 :: list    //9,List(5, 6, 7, 8),1,2,3,4
    val list6 = 9 :: list1 ::: list   //9,5,6,7,8,1,2,3,4
    println(list5.mkString(","))
    println(list6.mkString(","))
    */

    //特殊List集合：空集合
    /*
    println(List()) //List()
    println(Nil)    //List()
    val elemsToNil: List[Int] = 1 :: 2 :: 3 :: Nil  //List(1, 2, 3)
    println(elemsToNil)
    */

    //修改
    val list7: List[Int] = list.updated(2, 8) //1,2,8,4
    //println(list7.mkString(","))

    //查询数据
   /* for (elem <- list) {
      println(elem)
    }*/

    //删除数据
    val list8: List[Int] = list.drop(2) //删除前2个元素
    //println(list8.mkString(","))


    //TODO 可变集合
    val mlist = ListBuffer(1, 2, 3, 4)

//    mlist.insert()
//    mlist.update()
//    mlist.drop()
//    mlist.remove()

    //集合的属性
    /*
    //头
    println(mlist.head)    //1
    //尾（除了头之外）
    println(mlist.tail)    //ListBuffer(2, 3, 4)
    //最后一个
    println(mlist.last)    //4
    //初始化（除了最后一个）
    println(mlist.init)    //ListBuffer(1, 2, 3)
    */

    //TODO 队列：先进先出的性质
    val queue: mutable.Queue[Int] = mutable.Queue(1, 2, 3, 4)
    //入队
    queue.enqueue(5)
    println(queue)        //Queue(1, 2, 3, 4, 5)
    //出队
    val i: Int = queue.dequeue()
    println("i = " + i)   //i = 1
    println(queue)        //Queue(2, 3, 4, 5)


  }

}
