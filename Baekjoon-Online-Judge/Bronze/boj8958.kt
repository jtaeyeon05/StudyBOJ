fun main() {
    var case = readln().toInt()
    while (case-- > 0) {
        val str = readln()
        var score = 0
        for (i in str.indices) {
            loop@ for(ii in 0 .. i) {
                if (str[i - ii] == 'O') score++
                else break@loop
            }
        }
        println(score)
    }
}