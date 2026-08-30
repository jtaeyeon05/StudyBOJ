fun main() {
    val input = readln().toInt()
    var result = -1
    loop@ for (five in input / 5 downTo 0) {
        val three = (input - (5 * five)) / 3
        if (five * 5 + three * 3 == input) {
            if (result == -1 || result > five + three) result = five + three
            break@loop
        }
    }
    println(result)
}