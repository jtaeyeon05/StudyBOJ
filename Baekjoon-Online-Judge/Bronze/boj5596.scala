import scala.io.StdIn

object boj5596 :
  def main(args: Array[String]) =
    val getTotal = () => { StdIn.readLine().split(" ").map(_.toInt).sum }
    println(math.max(getTotal(), getTotal()))
