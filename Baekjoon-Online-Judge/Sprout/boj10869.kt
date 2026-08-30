import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    println("""
        ${a + b}
        ${a - b}
        ${a * b}
        ${a / b}
        ${a % b}
    """.trimIndent())
}