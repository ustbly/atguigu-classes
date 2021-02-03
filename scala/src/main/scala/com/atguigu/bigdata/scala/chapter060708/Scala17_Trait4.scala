package chapter060708

object Scala17_Trait4 {
  def main(args: Array[String]): Unit = {
    // var mysql = new Mysql17

    // TODO 动态混入特质,可以给对象动态扩展功能,扩展性非常强
    var mysql = new Mysql17 with DB17
    mysql.insert()
  }
}


trait Operate17 {
  println("Operate.........")
  def insert(): Unit = {
    println("插入数据")
  }
}

//特质也可以继承其他的特质
//特质重写父特质的方法
trait DB17 extends Operate17 {
  println("DB.........")
  override def insert(): Unit = {
    println("向数据库")
    super.insert()
  }
}



class Mysql17 {
}

