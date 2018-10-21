package day1

import scala.io.StdIn

object Ex12ListWhile{

  def main(args: Array[String]): Unit ={

    var input = ""
    var list: List[Int] = List()

    while (input != "bye"){

      list = if (list.isEmpty) List(0) else list ::: List(list.last + 1)

      println("Now the list is: " + list + ", write \"bye\" if you want to exit")

      input = StdIn.readLine().trim.toLowerCase()
    }

    println("Bye!")
  }

  // Given a = (-1, 2, 7), b = (0, 3, 1) and c = (2, 2, -3) calculate the following scalar products:
  // a·b, b·c, c·a
}

