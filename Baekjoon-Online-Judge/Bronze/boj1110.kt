fun main() {
    val input = readln().toInt()
    var sum = input
    loop@ for (cycle in 1 .. Int.MAX_VALUE) {
        sum = (sum % 10 * 10 + (sum / 10 + sum % 10) % 10)
        if (sum == input) {
            println(cycle)
            break@loop
        }
    }
}