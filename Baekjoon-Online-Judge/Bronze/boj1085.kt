import kotlin.math.abs

fun main() {
    val (x, y, w, h) = readln().split(" ").map { it.toInt() }
    println(listOf(x, y, abs(w - x), abs(h - y)).min())
}