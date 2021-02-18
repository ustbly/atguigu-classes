package chapter13

object Scala01_Class {
  def main(args: Array[String]): Unit = {

    test(new Child)

    //<: 表示泛型的上限，所以在传递数据时，应该为子类或者是当前类
    //>: 表示泛型的下限，但是和Java不太一样，所以在传递数据时，什么都可以传递
    def test[T <: User](t:T) = {
      println(t)
    }
  }
}


class Person{}

class User extends Person{}

class Child extends User{}

class Student{}