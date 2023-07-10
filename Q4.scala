package labsheet5

import scala.io.StdIn.readInt

object Q4 {


    def isEven(n:Int):Boolean = n match{
      case 0 => true
      case _ => isOdd(n-1)      //indirect recursion
    }

    def isOdd(n:Int):Boolean = !(isEven(n))


    def main(args: Array[String]): Unit = {
      println("Enter a number: ")
      var n = readInt()
      var ans = isEven(n)

      if (ans == true) {
        println("Even")
      }
      else {
        println("Odd")
      }

    }


}
