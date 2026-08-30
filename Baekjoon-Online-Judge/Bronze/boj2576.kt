fun main() {
    val list = List(7) { readln().toInt() }.filter { it % 2 == 1 }
    if (list.isEmpty()) {
        println(-1)
    } else {
        println(list.sum())
        println(list.min())
    }
}
