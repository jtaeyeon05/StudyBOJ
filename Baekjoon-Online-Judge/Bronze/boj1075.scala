object boj1075:
  def main(args: Array[String]) =
    val scanner = new java.util.Scanner(System.in)
    var a = scanner.nextLine
    a = a.slice(0, a.length - 2) + "00"
    val b = scanner.nextLong
    val result = (Math.ceil(a.toDouble / b).toLong * b).toString
    println(result.slice(result.length - 2, result.length))