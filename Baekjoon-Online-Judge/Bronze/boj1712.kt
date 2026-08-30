import kotlin.math.floor

fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }

    val plus = c - b

    if (plus <= 0) println(-1)
    else println(floor(a / plus.toDouble()).toInt() + 1)
}