package day1

object Ex11ListOperators{

  def main(args: Array[String]): Unit ={

    val list1 = List(0,1)
    val list2 = List(2,3,4)
    val list3 = List(5,6,7)

    println("1 :: list2 =")
    println(1 :: list2)
    println("---------------------------")

    println("list2.::(1) =")
    println(list2.::(1))
    println("---------------------------")

    println("list1 ::: list2 =")
    println(list1 ::: list2)
    println("---------------------------")

    println("list3.head =")
    println(list3.head)
    println("---------------------------")

    println("list3.tail =")
    println(list3.tail)
    println("---------------------------")

    // Next: append numbers to a list while user says yes

  }
}

