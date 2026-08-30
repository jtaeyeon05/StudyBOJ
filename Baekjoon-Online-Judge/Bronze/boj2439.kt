fun main() {
    val number = readln().toInt()
    repeat(number) {
        println(" ".repeat(number - it - 1) + "*".repeat(it + 1))
    }
}