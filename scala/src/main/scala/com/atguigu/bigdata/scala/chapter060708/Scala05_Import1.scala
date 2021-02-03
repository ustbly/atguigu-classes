package chapter060708

// scala中如果想要从最开始的包中查找类,需要增加绝对路径,使用_root_开头

import _root_.java.util._

package java {
  package util {

    class HashMap {

    }

    object Scala05_Import1 {
      def main(args: Array[String]): Unit = {
        var map = new HashMap() //chapter060708.java.util.HashMap@ea4a92b
        //var map = new _root_.java.util.HashMap()  //{}
        println(map)
      }
    }

  }

}

