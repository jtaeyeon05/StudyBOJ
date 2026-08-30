import java.util.Scanner

object boj11382 :
  def main(args: Array[String]) =
    val scanner = new Scanner(System.in)
    val scan = () => scanner.nextLong()
    println(scan() + scan() + scan())
