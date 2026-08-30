import java.util.*
import kotlin.math.roundToLong

fun main() {
    val scanner = Scanner(System.`in`)

    var caseSize = scanner.nextInt()

    while (caseSize-- > 0) {
        val west = scanner.nextInt()
        val east = scanner.nextInt()

        var result = 1.0

        for (n in east - west + 1 .. east) result *= n
        for (n in 1 .. west) result /= n

        println(result.roundToLong())
    }
}