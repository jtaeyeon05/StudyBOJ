import kotlin.math.roundToInt

fun main() =
    repeat(readln().toInt()) {
        val grades = readln().split(" ").let { it.slice(1 until it.size) }.map { it.toFloat() }
        val medium = grades.sum() / grades.size.toFloat()
        println("${
                "${
                    (grades.filter { 
                        it.toInt() > medium 
                    }.size / grades.size.toFloat() * 100000f).roundToInt() / 1000f
                }".let { it + "0".repeat(3 - it.split(".")[1].length) }
        }%")
    }