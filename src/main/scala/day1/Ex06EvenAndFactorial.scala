package day1

import scala.io.StdIn

object Ex06EvenAndFactorial{

  def main(args: Array[String]): Unit ={
    val n = StdIn.readLine().trim.toInt

    def isEven(n: Int): Boolean = {
      n % 2 == 0
    }

    def factorial(n: Int): Int = {
      if (n == 0) 1
      else n * factorial(n-1)
    }

    println(isEven(n))
    println(factorial(n))

  }

} //Next: ask for the capital of Madagascar until the answer is correct

