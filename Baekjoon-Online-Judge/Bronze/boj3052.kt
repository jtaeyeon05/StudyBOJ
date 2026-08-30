fun main() {
    val set = mutableSetOf<Int>()
    repeat(10) {
        set.add(readln().toInt() % 42)
    }
    println(set.size)
}