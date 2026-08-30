fun main() = repeat(readln().toInt()) {
    readln().split(" ").map { it.toInt() }.run {
        println("You get ${get(0) / get(1)} piece(s) and your dad gets ${get(0) % get(1)} piece(s).")
    }
}