import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.pow

fun main() {
    val (min, max) =
        ceil(readln().toInt().toDouble().pow(0.5)).toInt() to floor(readln().toDouble().pow(0.5)).toInt()

    if (min >= max) println(-1)
    else {
        println((min .. max).sumOf { it * it })
        println(min * min)
    }
}