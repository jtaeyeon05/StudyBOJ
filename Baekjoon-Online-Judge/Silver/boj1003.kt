import java.util.*

var fibonacciList = MutableList(41) { index ->
    if (index == 0 || index == 1) index
    else null
}

fun fibonacci(n: Int): Int {
    if (fibonacciList[n] == null) fibonacciList[n] = fibonacci(n - 1) + fibonacci(n - 2)
    return fibonacciList[n]!!
}

fun main() {
    val scanner = Scanner(System.`in`)
    var t = scanner.nextInt()
    while (--t >= 0) {
        val n = scanner.nextInt()
        println("${if (n == 0) 1 else fibonacci(n - 1)} ${fibonacci(n)}")
    }
}