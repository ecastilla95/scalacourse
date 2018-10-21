package day1

import scala.io.StdIn
import scala.util._

object Ex08ForAndForeach{

  def main(args: Array[String]): Unit ={

    println("Please introduce the amount of numbers to print:")
    val n = StdIn.readLine().trim.toInt

    for(i <- 1 to n){
      println(i)
    }

    println("Please introduce a list of numbers to print:")
    val l = StdIn.readLine().split(" ").map(_.trim.toInt)

    l.foreach(println)
  }



} // Next: Read and print three lines

