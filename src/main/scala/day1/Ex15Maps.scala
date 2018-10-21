package day1

object Ex15Maps{

  def main(args: Array[String]): Unit = {

    val map = Map(
      1 -> "I",
      2 -> "II",
      3 -> "III",
      4 -> "IV",
      5 -> "V",
      6 -> "VI",
      7 -> "VII",
      8 -> "VIII",
      9 -> "IX",
      10 -> "X"
    )

    println(map.get(1).orNull)
    println(map.get(4).orNull)
    println(map.get(9).orNull)

    println("----------------------------------------")

    println(map.keys.toList)
    println(map.values.toList)

  }
  /*
   Create a List with the numbers from 1 to n (input), print a list of the squares of these numbers
   */
}

