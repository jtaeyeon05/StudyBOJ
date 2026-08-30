fun main() {
    val primeList = MutableList(1_000_001) { if (it % 2 == 0 || it <= 1) 1 else 0 }; primeList[2] = 0
    val range = readln().split(" ").map { it.toInt() }

    for (i in 3 .. range[1] step 2) {
        for (j in 2 * i .. range[1] step i) {
            primeList[j] = 1
        }
    }

    for (i in range[0] .. range[1]) if (primeList[i] == 0) println(i)
}