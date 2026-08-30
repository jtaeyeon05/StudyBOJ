fun main() = mutableSetOf<String>().run {
    repeat(readln().toInt()) { add(readln()) }
    println(sortedWith(compareBy({it.length}, {it})).joinToString("\n"))
}