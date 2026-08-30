import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val x = scanner.nextInt()
    val y = scanner.nextInt()

    println(
        if (x > 0) {
            if (y > 0) 1
            else 4
        } else {
            if (y > 0) 2
            else 3
        }
    )
}