fun sum(value: Int) = (value * value + value) / 2

fun main() {
    val index = readln().toInt()
    loop@ for (row in 1..4472) {
        if (sum(row) >= index) {
            val realIndex = index - sum(row - 1)
            if (row % 2 == 0) println("${realIndex}/${row + 1 - realIndex}")
            else println("${row + 1 - realIndex}/${realIndex}")
            break@loop
        }
    }
}