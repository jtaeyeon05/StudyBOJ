fun main() {
    val input = readln().toInt()

    if (input < 10) {
        println(input)
    } else {
        var result = 9
        for (i in 10 .. input) {
            val d = i.toString()[0].digitToInt() - i.toString()[1].digitToInt()
            var ra = true
            for (ii in 0 until i.toString().length - 1) if (d != i.toString()[ii].digitToInt() - i.toString()[ii + 1].digitToInt()) ra = false
            if (ra) result++
        }
        println(result)
    }
}