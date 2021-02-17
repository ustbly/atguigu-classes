package chapter10

import scala.collection.mutable

object Scala05_Map {
  def main(args: Array[String]): Unit = {
    // Map集合:K-V对
    // hashmap.put("k","v")
    // Scala中k-v对数据采用特殊的方式声明
    // TODO 默认Map集合不可变

    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map.mkString(","))

    //增加数据
    val map1: Map[String, Int] = map.+("d" -> 4)
    println(map1.mkString(","))
    //如果键已经存在，那么新值代替旧值
    val map2: Map[String, Int] = map.+("a" -> 5)
    println(map2.mkString(","))

    //删除数据
    val map3: Map[String, Int] = map.-("b")
    //println(map3.mkString(","))
    //删除前n个k-v对
    val map4: Map[String, Int] = map.drop(2)
    println(map4.mkString(","))

    //修改数据
    val map5: Map[String, Int] = map.updated("b", 10)
    println(map5.mkString(","))

    // TODO Map-取值

    // 方式1-使用map(key)
    // 说明:
    //  1) 如果键存在, 返回对应的值对象
    //  2) 如果键不存在, 抛出异常
    //  3) 在java中 如果不存在返回null
    val i = map("a")
    println(i)

    // 方式2-使用contains方法检查是否存在key
    // 使用containts先判断在取值，可以防止异常，并加入相应的处理逻辑
    val map6: mutable.Map[String, Double] = mutable.Map(("A", 1), ("B", 2), ("C", 3), ("D", 30.9))
    if (map6.contains("B")) {
      println("key存在 值= " + map6("B"))
    } else {
      println("key不存在")
    }
    // 方式3-使用map.get(key).get取值
    // 通过 映射.get(键) 这样的调用返回一个Option对象，要么是Some，要么是None
    // Scala为了防止集合出现空指针问题,提供了一个特殊的类:Option,有两个特殊的对象:Some(有值),None(无值)
    // 如果确实没有获取到数据,为了不出现异常,Option类提供了有默认值的方法
    println(map.get("b")) // Some(2) 存在为Some,不存在为None
    println(map.get("b").get) // 2
    // println(map.get("f").get) // 报错

    // 方式4-使用map4.getOrElse()取值
    println(map.get("f").getOrElse("没找到")) // 没有则返回默认值
    println(map.get("c").getOrElse("没找到")) // 没有则返回默认值

    // 如何选择取值方式建议
    //  1.如果我们确定key是存在的，应该使用map("key") ,速度快.
    //  2.如果我们不确定key是否存在，而且在不存在时，有业务逻辑处理就是用map.contains() 配合 map("key")
    //  3.如果只是简单的希望返回一个值，就使用getOrElse()

    // TODO 可变Map集合
    val mmap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    //mmap.update()
    //mmap.drop()
    //mmap.+()
    //mmap + ()

    // todo 更新map的元素
    // 说明:
    //  1.map 是可变的，才能修改，否则报错
    //  2.如果key存在：则修改对应的值,key不存在,等价于添加一个key-val
    val map7: mutable.Map[String, Any] = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    map7("A") = 20 //修改或增加
    println(map7)

    // TODO 对map遍历
    // 说明
    //  1.每遍历一次，返回的元素是Tuple2
    //  2.取出的时候，可以按照元组的方式来取
    val map8 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    for ((k, v) <- map8) println(k + " is mapped to " + v)
    for (v <- map8.keys) println(v)
    for (v <- map8.values) println(v)
    for (v <- map8) println(v)


    // TODO 创建空的映射
    val mapZero = new scala.collection.mutable.HashMap[String, Int]
    println(mapZero)
  }
}
