package day1

import scala.io.StdIn

object Ex16Mapping {

  def main(args: Array[String]): Unit = {

    val n = StdIn.readLine().trim.toInt

    val list = Range(1, n+1).toList

    val result = list.map( i => i*i )

    println(result)

  }

  /*
 You are given the following list:
 List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9), List(10))
 Print a list with the squares of any number contained in this list
   */
}

