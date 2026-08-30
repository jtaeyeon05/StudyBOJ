fun main() {
    val len = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.sorted()
    val b = readln().split(" ").map { it.toInt() }.sorted().reversed()
    println((0 until len).sumOf { a[it] * b[it] })
}