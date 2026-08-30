fun main() {
    val primeList = MutableList(5000) { 2 * it + 3 }; primeList.add(0, 2)
    val (start, end) = readln().toInt() to readln().toInt()


    for (i in 3 .. end step 2) {
        for (j in 2 * i .. end step i) {
            primeList.remove(j)
        }
    }

    var (rStart, rEnd) = -1 to -1
    primeList.forEachIndexed { index, item ->
        if (rStart == -1 && item >= start) {
            rStart = index
        } else if (rEnd == -1 && item > end) {
            if (primeList[index - 1] in start .. end) rEnd = index
            return@forEachIndexed
        }
    }

    val result = primeList.slice(rStart until rEnd)

    if (result.isNotEmpty()) {
        println(result.sum())
        println(result[0])
    } else {
        println(-1)
    }
}