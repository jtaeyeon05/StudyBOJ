fun main() {
    val input = readln().toInt()
    var isCompleted = false
    loop@ for (five in input / 5 downTo 0) {
        if ((input - five * 5) % 2 == 0) {
            println(five + (input - five * 5) / 2)
            isCompleted = true
            break@loop
        }
    }
    if (!isCompleted) println(-1)
}