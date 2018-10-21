package day1

import java.lang.Math.{sqrt, acos}

object Ex13ScalarProduct{

  def main(args: Array[String]): Unit ={

    val a = (-1, 2, 7)
    val b = (0, 3, 1)
    val c = (2, 2, -3)

    def scalarProduct(x: (Int, Int, Int), y: (Int, Int, Int)) = {
      (x._1*y._1) + (x._2*y._2) + (x._3*y._3)
    }

    println(scalarProduct(a, b))
    println(scalarProduct(b, c))
    println(scalarProduct(c, a))
  }

/*
Initialize a new set, then add an element to the set.
Afterwards, check wether the set contains an element (true/false) and print the answer
 */

}

