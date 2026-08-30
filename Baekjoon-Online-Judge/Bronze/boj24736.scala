import java.util.Scanner

object boj24736 {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val points = Array(6, 3, 2, 1, 2)

    for (team <- 0 to 1) {
      var teamPoint = 0
      for ((point, index) <- points.zipWithIndex) {
        teamPoint += scanner.nextInt() * point
      }
      print(teamPoint)
      if (team == 0) print(" ")
    }
  }
}
