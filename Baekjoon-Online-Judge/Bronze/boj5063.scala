import java.util.Scanner

object boj5063 :
  def main(args: Array[String]) =
    val scanner = new Scanner(System.in)

    for (index <- 0 until scanner.nextInt()) {
      val r = scanner.nextInt()
      val e = scanner.nextInt()
      val c = scanner.nextInt()

      println(
        if (r + c < e) "advertise"
        else if (r + c == e) "does not matter"
        else "do not advertise"
      )
    }
