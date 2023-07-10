package labsheet5

import scala.io.StdIn.readInt

object Q5 {

    var sum = 0
    var i = 0

    def printEvenSum(n: Int): Int = {
      if (i >= n) {
        println(sum)
        return 0
      }
      if (i < n & i % 2 == 0) {
        sum = sum + i
        i = i + 2
        printEvenSum(n)
      }
      else {
        i = i + 1
        printEvenSum(n)
      }

    }

    def main(args: Array[String]): Unit = {
      println("Enter a number for n: ")
      var n = readInt()
      printEvenSum(n)
    }


}
