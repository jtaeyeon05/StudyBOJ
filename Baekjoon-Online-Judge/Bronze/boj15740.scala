import java.util.Scanner
import math.BigInt.javaBigInteger2bigInt

object boj15740 {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)

    val a = scanner.nextBigInteger()
    val b = scanner.nextBigInteger()

    println(a + b)
  }
}
