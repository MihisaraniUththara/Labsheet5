package labsheet5

import scala.io.StdIn.readInt

object Q1 {



    def gcd(a: Int, b: Int): Int = b match {
      case 0 => a
      case x if x > a => gcd(x, a)
      case _ => gcd(b, a % b) //tail recursion
    }

    def prime(number: Int, n: Int = 2): Boolean = n match {
      case x if number == x => true
      case x if gcd(number, x) > 1 => false
      case x => prime(number, x + 1)
    }


    def main(args: Array[String]): Unit = {
      println("Enter a number: ")
      var num = readInt()
      println(prime(num))


    }

}
