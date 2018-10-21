package day1

import scala.io.StdIn

object Ex10ArrayString2{

  def main(args: Array[String]): Unit ={

    val helloString = new Array[String](3)

    println("Please introduce three lines to print:")
    for(i <- helloString.indices){
      helloString(i) = StdIn.readLine()
    }

    helloString.foldLeft(){(_, e) => println(e)}

    val string = helloString.foldLeft(""){(acc, e) => acc + e}

    println(string)

  }



} // Create three lists (list1-3) and see what the :: , ::: , head and tail operators do

