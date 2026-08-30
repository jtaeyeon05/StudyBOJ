import scala.io.StdIn

object boj2941 :
  val double = Array("c=", "c-", "d-", "lj", "nj", "s=", "z=")
  val triple = "dz="

  def main(args: Array[String]) =
    var data = StdIn.readLine()
    var result = 0
    for (index <- 0 until data.length) {
      if (data(index) != '@') {
        result += 1
        if (index == data.length - 1) { // 남은 것: 0개
          data = changeString(data, index to index)
        } else if (index == data.length - 2) { // 남은 것: 1개
          var isDouble = false
          for (word <- double) {
            if (data(index) == word(0) && data(index + 1) == word(1)) {
              data = changeString(data, index to index + 1)
              isDouble = true
            }
          }
          if (!isDouble) {
            data = changeString(data, index to index)
          }
        } else { // 남은 것: 2개 이상
          if (Array(data(index), data(index + 1), data(index + 2)).mkString == triple) {
            data = changeString(data, index to index + 2)
          } else {
            var isDouble = false
            for (word <- double) {
              if (data(index) == word(0) && data(index + 1) == word(1)) {
                data = changeString(data, index to index + 1)
                isDouble = true
              }
            }
            if (!isDouble) {
              data = changeString(data, index to index)
            }
          }
        }
      }
    }
    println(result)

  def changeString(string: String, range: Range.Inclusive) =
    val data = string.toCharArray
    for (index <- range) data(index) = '@'
    data.mkString
