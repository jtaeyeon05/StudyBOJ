import java.util.Scanner

object boj10250 :
  def main(args: Array[String]) =
    val scanner = Scanner(System.in)
    for (_ <- 0 until scanner.nextInt()) {
      val h = scanner.nextInt()
      val w = scanner.nextInt()
      val n = scanner.nextInt()
      println(
        (if (n % h == 0) h else n % h) * 100 +
          Math.ceil(n.toFloat / h.toFloat).toInt
      )
    }
