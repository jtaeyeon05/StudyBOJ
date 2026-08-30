fun d(n: Int): Int {
    var result = n
    for (i in n.toString()) result += i.digitToInt()
    return result
}

fun main() {
    val selfNumbers = MutableList(10000) { it + 1}

    loop@ for (i in 1 .. Int.MAX_VALUE) {
        val d = d(i)
        selfNumbers.remove(d)
        if (d > 100000) break@loop
    }

    println(selfNumbers.joinToString("\n"))
}