fun main() {
    repeat(readln().toInt()) {
        println("Case #${it + 1}: ${readln().split(" ").sumOf { n -> n.toInt() }}")
    }
}