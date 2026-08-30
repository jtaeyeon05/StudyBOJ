import java.util.*
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    var turn = scanner.nextLine().toInt()
    while (turn-- > 0) {
        val raw = scanner.nextLine()
        val info = Array(6) { index -> raw.split(" ")[index].toFloat() }

        val ods = (info[0] - info[3]).pow(2) + (info[1] - info[4]).pow(2)
        val rms = (info[2] - info[5]).pow(2)
        val rss = (info[2] + info[5]).pow(2)

        println(
            if (info[0] == info[3] && info[1] == info[4] && info[2] == info[5]) -1
            else if (ods == rss || ods == rms) 1
            else if (ods < rms || ods > rss) 0
            else 2
        )
    }
}