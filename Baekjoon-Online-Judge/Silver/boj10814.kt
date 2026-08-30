fun main() {
    val arrayList = arrayListOf<Triple<Int, Int, String>>()

    repeat(readln().toInt()) { index ->
        readln().split(" ").let {
            arrayList.add(Triple(it[0].toInt(), index, it[1]))
        }
    }

    println(arrayList.sortedBy { it.first * 1_000_000 + it.second }.joinToString("\n", transform = { "${it.first} ${it.third}" }))
}