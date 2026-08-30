fun main() {
    val asc = (1 .. 8).joinToString(" ")
    val des = (8 downTo 1).joinToString(" ")

    println(
        when (readln()) {
            asc -> "ascending"
            des -> "descending"
            else -> "mixed"
        }
    )
}