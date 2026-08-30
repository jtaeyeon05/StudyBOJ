fun main() {
    val value = readln().split(" ").let { it[0].toInt() to it[1].toInt() }
    println(if (value.first < value.second) "<" else if (value.first > value.second) ">" else "==")
}