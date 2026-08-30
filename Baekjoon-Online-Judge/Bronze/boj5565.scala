import java.util.Scanner

object boj5565 :
  def main(args: Array[String]) =
    val scanner = new Scanner(System.in)
    var result = scanner.nextInt()
    for (_ <- 0 until 9) result -= scanner.nextInt()
    println(result)
