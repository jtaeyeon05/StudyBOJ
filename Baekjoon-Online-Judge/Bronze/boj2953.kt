fun main() {
    List(5) { readln().split(" ").sumOf { it.toInt() } }.let {
        println("${it.indexOf(it.max()) + 1} ${it.max()}")
    }
}