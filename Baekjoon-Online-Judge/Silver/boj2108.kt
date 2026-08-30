import kotlin.math.roundToInt

fun main() {
    val list = List(readln().toInt()) { readln().toInt() }.sorted()

    val count = MutableList(8001) { 0 }
    list.forEach { count[it + 4000]++ }
    val max = count.max()
    val indexList = arrayListOf<Int>()
    count.forEachIndexed { index, item -> if (max == item) indexList.add(index) }

    println(list.average().roundToInt())
    println(list[list.size / 2])
    println(if (indexList.size > 1) indexList[1] - 4000 else indexList.first() - 4000)
    println(list.last() - list.first())
}