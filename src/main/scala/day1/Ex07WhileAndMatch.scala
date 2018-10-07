package day1

import scala.io.StdIn
import scala.util._

object Ex07WhileAndMatch{

  def main(args: Array[String]): Unit ={

    println("Please introduce the capital of Madagascar to exit:")
    var name = StdIn.readLine().trim
    var i = 0

    while ((name.toLowerCase != "antananarivo") && (name.toLowerCase != "tana")) {

      i match {
        case 0 => println("Hint: First leter is an A")
        case _ => Try("Antananarivo"(i)) match {
          case Success(_) => println("Hint: " + "Antananarivo".slice(0, i+1)+"...")
          case Failure(_) => println("You are not very smart, are you?")
        }
      }

      i += 1
      name = StdIn.readLine().trim
    }

    println("Well done! It only took " + (i + 1) + " tries!" )
  }



}

