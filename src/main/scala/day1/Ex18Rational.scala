package day1

object Ex18Rational {

  def main(args: Array[String]): Unit = {

    val a = new Rational(1, 3)

    println(a)
    println(a.add(new Rational(1, 3)))

  }
}

class Rational(n: Int, d: Int) {
  require(d != 0)
  val numerator: Int = n
  val denominator: Int = d

  def this(n: Int) = this(n, 1)

  override def toString = n + "/" + d

  def add(that: Rational): Rational = new Rational(numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)

}

/* Create a while loop that asks for a string that matches a Regex YYYY/MM/DD
  (the string doesn't need to be a real date)
  */

