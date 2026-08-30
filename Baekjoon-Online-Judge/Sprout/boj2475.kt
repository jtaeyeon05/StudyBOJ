fun main() {
    println(readln().split(" ").sumOf { it.toInt() * it.toInt() } % 10)
}