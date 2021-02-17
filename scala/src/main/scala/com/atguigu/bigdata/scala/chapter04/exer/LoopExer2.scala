package chapter04.exer

object LoopExer2 {
  /**
   * 一层for循环打印九层正三角形星号
   *
   */
    /*
                  *
                 ***
                *****
               *******
              *********
             ***********
            *************
           ***************
          *****************

     */
  def main(args: Array[String]): Unit = {
    for (i <- Range(1, 18, 2)) {
      println(" " * ((18 - i)/2) + "*" * i)
    }

  }
}
