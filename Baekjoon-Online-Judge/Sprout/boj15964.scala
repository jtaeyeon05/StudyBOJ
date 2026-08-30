import java.util.Scanner

object boj15964:
  def main(args: Array[String]) =
    val scanner = new Scanner(System.in)
    print(math.pow(scanner.nextInt(), 2).toLong - math.pow(scanner.nextInt(), 2).toLong)
