fun main() {
    val list = MutableList(30) { it + 1 }
    for (i in 0 until 28) list.remove(readln().toInt())
    println(list.joinToString("\n"))
}