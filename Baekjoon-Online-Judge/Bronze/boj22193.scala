import java.util.Scanner
import math.BigInt.javaBigInteger2bigInt

object boj22193 {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    scanner.nextLine()
    print(scanner.nextBigInteger() * scanner.nextBigInteger())
  }
}