import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val first = scanner.nextLine()
    val second = scanner.nextLine()

    println(
        """
            ${first.toInt() * second[2].digitToInt()}
            ${first.toInt() * second[1].digitToInt()}
            ${first.toInt() * second[0].digitToInt()}
            ${first.toInt() * second.toInt()}
        """.trimIndent()
    )
}