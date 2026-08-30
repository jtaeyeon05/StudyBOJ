fun main() = readln().split(" ").map { it.toLong() }.run {
    println(get(0) * get(0) - get(1) * get(1))
}