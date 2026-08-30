fun main() {
    List(readln().toInt()) { readln() }
        .sortedWith(compareBy({it.split(" ")[0].toInt()}, {it.split(" ")[1].toInt()}))
        .forEach(::println)
}