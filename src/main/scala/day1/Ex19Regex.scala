package day1

import scala.io.StdIn
import scala.util.matching.Regex


object Ex19Regex {

  def main(args: Array[String]): Unit = {

    var n = true
    var string = ""

    while (n) {

      val pattern = "([0-9]{4}/[0-9]{2}/[0-9]{2})"

      println("Please enter your date of birth: (YYYY/MM/DD): ")

      string = StdIn.readLine()
      n = !string.matches(pattern)

    }

    println("Your date of birth is: " + string)

  }

  /*
  * Create a program that:
   * -> has a function that reads a line: if this line is an integer, then print it. Otherwise print an error message and calls itself (recursive)
  * */
}


