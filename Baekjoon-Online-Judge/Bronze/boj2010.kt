fun main() =
    readln().toInt().let {
        println((1 .. it).sumOf { readln().toInt() } - it + 1)
    }