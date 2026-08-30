fun main() {
    println(List(3) { readln().toInt() }.min() + List(2) { readln().toInt() }.min() - 50)
}