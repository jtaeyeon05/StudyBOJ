fun main() {
    val list = List(5) { readln().toInt() }
    println(list.average().toInt())
    println(list.sorted()[2])
}