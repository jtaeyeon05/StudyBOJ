fun main() {
    readln()
    val list = readln().split(" ").map { it.toInt() }.sorted()
    println("${list[0]} ${list.reversed()[0]}")
}