import scala.io.StdIn

object boj16430 :
  def main(args: Array[String]) =
    val cheese = StdIn.readLine().split(" ").map(_.toInt)
    println(cheese(1) - cheese(0) + " " + cheese(1))
