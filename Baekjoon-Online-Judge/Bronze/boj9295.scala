import java.util.Scanner

object boj9295:
  def main(args: Array[String]) =
    val scanner = new Scanner(System.in)
    for (index <- 1 to scanner.nextInt) println("Case " + index + ": " + (scanner.nextInt + scanner.nextInt))
