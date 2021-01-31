package chapter04

import scala.io.StdIn

/**
 * 岳小鹏参加scala考试，他和父亲岳不群达成承诺：
 * 如果：
 * 成绩为100分时，奖励一辆BMW；
 * 成绩为(80，99]时，奖励一台iphone7plus；
 * 当成绩为[60,80]时，奖励一个 iPad；
 * 其它时，什么奖励也没有。
 */
object Scala01_BranchExer {
  def main(args: Array[String]): Unit = {
    println("输入您的考试成绩：")
    var score = StdIn.readInt()
    if(score == 100) {
      println("BMW")
    } else if (score > 80 && score <= 99) {
      println("iphone7plus")
    } else if (score >= 60 && score <= 80) {
      println("iPad")
    } else {
      println("Nothing!")
    }
  }
}
