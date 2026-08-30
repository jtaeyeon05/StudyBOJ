import scala.io.StdIn

object boj10156 :
  def main(args: Array[String]) =
    val info = StdIn.readLine().split(" ").map((number) => { number.toInt })
    val wanted = info(2) - info(0) * info(1)
    println(if (wanted < 0) -wanted else 0)
