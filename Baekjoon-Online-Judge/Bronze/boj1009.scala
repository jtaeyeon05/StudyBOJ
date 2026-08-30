import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object boj1009 :
  def main(args: Array[String]) =
    for (index <- 0 until StdIn.readLine().toInt) {
      val info = StdIn.readLine().split(" ").map(_.toInt)
      val digits = get1Digits(info(0))
      val value = digits((info(1) - 1) % digits.size)
      println(if (value == 0) 10 else value)
    }

  def get1Digits(number: Int) =
    val list = ArrayBuffer(number % 10)
    var now = ((list.last % 10) * (number % 10)) % 10
    while (list(0) != now) {
      list += now
      now = ((list.last % 10) * (number % 10)) % 10
    }
    list
