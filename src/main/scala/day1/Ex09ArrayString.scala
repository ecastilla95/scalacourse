package day1

import scala.io.StdIn

object Ex09ArrayString{

  def main(args: Array[String]): Unit ={

    val helloString = new Array[String](3)

    println("Please introduce three lines to print:")
    helloString(0) = StdIn.readLine()
    helloString(1) = StdIn.readLine()
    helloString(2) = StdIn.readLine()

    for(i <- 0 to 2){
      println(helloString(i))
    }

  }

} //Next: Read and print three lines without using imperative style

