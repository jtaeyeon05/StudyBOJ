fun main() {
    var input = readln().toInt()
    var result = if (input != 0) input else 1
    while (--input > 0) result *= input
    println(result)
}