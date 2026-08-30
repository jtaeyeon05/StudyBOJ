fun main() {
    val (a, b) = readln().split(" ")

    var min = 100
    for (i in 0 .. b.length - a.length) {
        var nowMin = 0
        for (ii in a.indices) if (a[ii] != b[ii + i]) nowMin++
        if (nowMin < min) min = nowMin
    }

    println(min)
}