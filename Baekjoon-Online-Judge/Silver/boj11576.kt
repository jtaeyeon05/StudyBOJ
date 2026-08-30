import kotlin.math.pow

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val digit = readln().toInt()

    var aa = 0
    val bb = arrayListOf<Int>()

    readln().split(" ").forEachIndexed { index, item ->
        aa += item.toInt() * a.toDouble().pow(digit - index - 1).toInt()
    }

    for (index in 0 .. 20) {
        if (aa > b.toDouble().pow(index).toInt()) {
            bb.add(aa % b.toDouble().pow(index + 1).toInt() / b.toDouble().pow(index).toInt())
        }
    }

    println(bb.reversed().joinToString(" "))
}