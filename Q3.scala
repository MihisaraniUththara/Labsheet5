package labsheet5

import scala.io.StdIn.readInt

object Q3 {

  def sum(x: Int): Int = {
    var total = 0
    if (x==1) {
      total = 1
    }
    else {
      total = x+sum(x-1)
    }
    total
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    var n = readInt()
    var t = sum(n)
    println("sum is ", t)
  }

}
