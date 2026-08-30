fun main() {
    val (n, l) = readln().split(" ").map { it.toLong() }
    for (i in l.toInt() .. 100) {
        if (i % 2 == 0) {
            if (n % i == i / 2L) {
                val range = n / i - i / 2 + 1..n / i + i / 2
                if (range.toList().size <= 100 && range.toList().size == i) {
                    println(if (range.first < 0) -1 else range.joinToString(" "))
                    break
                }
            }
        } else {
            if (n % i == 0L) {
                val range = n / i - i / 2..n / i + i / 2
                if (range.toList().size <= 1000 && range.toList().size == i) {
                    println(if (range.first < 0) -1 else range.joinToString(" "))
                    break
                }
            }
        }
        if (i == 100) println(-1)
    }
}