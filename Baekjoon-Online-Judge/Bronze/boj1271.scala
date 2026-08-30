import java.util.Scanner
import scala.math.BigInt.javaBigInteger2bigInt

object boj1271 {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)

    val money = scanner.nextBigInteger()
    val people = scanner.nextBigInteger()

    println(money / people)
    println(money % people)
  }
}