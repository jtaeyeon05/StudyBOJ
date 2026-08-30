fun main() {
    println(
        when (readln().toInt()) {
            in 90 .. 100 -> "A"
            in 80 .. 89 -> "B"
            in 70 .. 79 -> "C"
            in 60 .. 69 -> "D"
            else -> "F"
        }
    )
}