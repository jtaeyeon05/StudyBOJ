fun main() {
    println(List(5) { readln().toInt().let { if (it < 40) 40 else it } }.average().toInt())
}
