fun main() {
    val (col, row) = readln().split(" ").map { it.toInt() }

    val getMatrix = {
        arrayListOf<List<Int>>().apply {
            repeat(col) {
                add(readln().split(" ").map { it.toInt() })
            }
        }.toList()
    }

    val a = getMatrix()
    val b = getMatrix()

    repeat(col) { c ->
        if (c != 0) println()
        repeat(row) { r ->
            print(a[c][r] + b[c][r])
            print(" ")
        }
    }
}