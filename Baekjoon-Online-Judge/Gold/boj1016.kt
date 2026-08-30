import java.util.*
import kotlin.math.ceil
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)

    val min = scanner.nextLong()
    val max = scanner.nextLong()

    val zys = mutableSetOf<Long>()

    for (n in 2L .. sqrt(max.toDouble()).toLong()) {
        if (sqrt(n.toDouble()).let { it != it.toInt().toDouble() }) {
            val nn = n * n
            for (nns in ceil(min.toDouble() / nn.toDouble()).toLong() * nn..max step nn) {
                zys.add(nns)
            }
        }
    }

    println(max - min + 1L - zys.size)
}