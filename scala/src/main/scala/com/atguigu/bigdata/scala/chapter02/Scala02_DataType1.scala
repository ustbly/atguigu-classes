package chapter02

/*
  数据类型

  Unit：表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
  Null：null , Null 类型只有一个实例值 null
  Nothing：Nothing类型在Scala的类层级的最低端；它是任何其他类型的子类型。
          当一个函数，我们确定没有正常的返回值，可以用Nothing 来指定返
          回类型，这样有一个好处，就是我们可以把返回的值（异常）赋给其
          它的函数或者变量（兼容性）
 */
object Scala02_DataType1 {
  def main(args: Array[String]): Unit = {
    val i: Int = 10;

    val d: Double = i.toDouble;//把Int值转为Double值

    println(d);

    sayOk()

    val s : String = null;

    //val ii : Int = null;    //无法转化
    //print(ii)

  }

  def sayOk() : Unit = {
    println("sayOk...")
  }

  def test() : Nothing = {  //作为没有正常返回值的方法的返回类型
    throw new Exception();
  }
}
