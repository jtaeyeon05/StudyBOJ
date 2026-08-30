import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val input = scanner.nextLong()
        var one = 0L
        loop@ for (index in 1 .. Int.MAX_VALUE) {
            one = (one * 10L + 1L) % input
            if (one % input == 0L) {
                println(index)
                break@loop
            }
        }
    }
}