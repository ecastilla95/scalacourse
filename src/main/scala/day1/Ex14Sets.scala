package day1

object Ex14Sets{

  def main(args: Array[String]): Unit = {

    var jetSet = Set("Boeing", "Airbus", "AAR Corp", "AviaBellanca Aircraft")
    jetSet = jetSet.+("Lear")

    println(jetSet.contains("Cessna"))

  }
  /*
  Create a Map that transforms numbers from 1 to 10 into their Roman number equivalent.
  Then use it to print numbers 1, 4 and 9.
   */
}

