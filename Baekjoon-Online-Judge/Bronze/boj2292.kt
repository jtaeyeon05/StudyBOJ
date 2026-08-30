fun main() {
    val target = readln().toInt()
    var rooms = 1
    loop@ for (i in 1 .. Int.MAX_VALUE) {
        rooms += 6 * (i - 1)
        if (rooms >= target) {
            println(i)
            break@loop
        }
    }
}