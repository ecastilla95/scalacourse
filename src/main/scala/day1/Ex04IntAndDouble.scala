package day1

import scala.io.StdIn

object Ex04IntAndDouble {

  def main(args: Array[String]): Unit ={
    val n = StdIn.readLine().trim.toInt

    val nSquared: Int = n * n

    val radius: Double = n/(2 * 3.14)

    println(nSquared)
    println(radius)
  }

}
