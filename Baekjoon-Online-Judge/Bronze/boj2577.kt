fun main() {
    val number = readln().toInt() * readln().toInt() * readln().toInt()
    for (i in 0 .. 9) {
        println(number.toString().count { it == (i + '0'.code).toChar() })
    }
}
