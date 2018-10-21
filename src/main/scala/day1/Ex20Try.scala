package day1

import scala.io.StdIn
import scala.util.{Failure, Success, Try}


object Ex20Try {

  def main(args: Array[String]): Unit = {

    tryExample
  }

  def tryExample: Unit = {

    val n = Try(StdIn.readLine().trim.toInt)

    n match {
      case Success(_) => println(n.get + "can be parsed as an Integer")
      case Failure(_) =>
        println("Number introduced is not an integer")
        tryExample
    }
  }
}


