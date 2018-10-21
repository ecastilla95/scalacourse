package day1

import scala.io.StdIn

object Ex17FlatMap {

  def main(args: Array[String]): Unit = {

    val list: Seq[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9), List(10))

    val result = list.flatMap( l => l.map(i => i*i))

    println(result)

  }

  /*
Create a class called Rational which expresses a rational number,
this class is composed by two Integers: numerator and denominator.
Use the method 'require' to forbid the denominator of being zero
This class has the following method:
> toString : prints numerator/denominator (overridden)
> add : add two rationals
> an auxiliar constructor where we give an Integer n and are returned a Rational(n, 1)
   */
}

