fun main() {
    var result = 0 to 0
    for (index in 1 .. 9) {
        readln().toInt().let {
            if (it > result.first) result = it to index
        }
    }
    println(result.first)
    println(result.second)
}