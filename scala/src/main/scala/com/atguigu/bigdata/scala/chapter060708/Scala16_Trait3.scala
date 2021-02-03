package chapter060708

object Scala16_Trait3 {
  def main(args: Array[String]): Unit = {
    var mysql = new Mysql
    mysql.insert()
  }
}


trait Operate {
  println("Operate.........")
  def insert(): Unit = {
    println("插入数据")
  }
}

//特质也可以继承其他的特质
//特质重写父特质的方法
trait DB extends Operate {
  println("DB.........")
  override def insert(): Unit = {
    println("向数据库")
    super[Operate].insert()
  }
}

trait File extends Operate {
  println("File.........")
  override def insert(): Unit = {
    println("向文件")
    super.insert()
  }
}

// 多特质混入时,代码执行顺序为从左到右,如果有父特质,会优先执行
// 多特质混入时,方法调用顺序为从右到左
// 特质中super关键字不是指代父特质,指代的是上一级特质(如File上一级特质是DB)
// 如果希望super指向父特质,需要增加特殊操作: super[特质]
// java中接口可以在scala中当成特质来用
class Mysql extends File with DB with Serializable {
}

