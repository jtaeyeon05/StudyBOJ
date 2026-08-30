import scala.io.StdIn

object boj1924 :
  def main(args: Array[String]) =
    val months = Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val week = Array("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")

    val today = StdIn.readLine().split(" ").map(_.toInt)
    var bynow = today(1)

    for (month <- 0 to today(0) - 2) bynow += months(month)

    println(week(bynow % 7))