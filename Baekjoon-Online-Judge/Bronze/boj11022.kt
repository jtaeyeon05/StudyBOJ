fun main() {
    repeat(readln().toInt()) { index ->
        val data = readln().split(" ").let { it[0].toInt() to it[1].toInt() }
        println("Case #${index + 1}: ${data.first} + ${data.second} = ${data.first + data.second}")
    }
}