import kotlin.math.max

fun main() {
    readln().split(" ").let {
        println(max(it[0].reversed().toInt(), it[1].reversed().toInt()))
    }
}