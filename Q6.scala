package labsheet5

import scala.io.StdIn.readInt

object Q6 {


    //FIBONACCI SERIES
    def fib(num: Int): Int = num match {
      case 0 => num
      case 1 => num
      case _ => fib(num - 1) + fib(num - 2) //multiple recursion (binary)
    }


    //FIBONACCI SEQUENCE OF NUMBERS
    def fibseq(n: Int): Unit = {
      if (n > 0) fibseq(n - 1) //non-tail recursion
      println(fib(n))
    }


    def main(args: Array[String]): Unit = {
      println("Enter a number for n:")
      var n = readInt()
      fibseq(n)
    }
}
