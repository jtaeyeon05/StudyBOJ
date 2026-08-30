fun main() {
    readln()
    val numbers = readln().split(" ")
    val input = readln().toInt()
    var n = 0
    numbers.forEach { if (it.toInt() == input) n++ }
    println(n)
}