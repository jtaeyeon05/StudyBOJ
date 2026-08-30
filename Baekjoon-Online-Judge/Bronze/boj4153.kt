fun main() {
    loop@ while (true) {
        val (a, b, c) = readln().split(" ").map { it.toInt() * it.toInt() }.sorted()
        if (a == 0 && b == 0 && c == 0) break@loop
        println(if (a + b == c) "right" else "wrong")
    }
}