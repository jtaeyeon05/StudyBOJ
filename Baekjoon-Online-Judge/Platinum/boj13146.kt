fun main() {
    val list = arrayListOf<Long>()
    var tries = 0L
    repeat(readln().toInt()) {
        val input = readln().toLong()
        if (list.isNotEmpty() && list.last() < input) {
            tries += input - list.last()
            while (list.isNotEmpty() && list.last() < input) {
                list.removeLast()
            }
        }
        list.add(input)
    }
    println(tries + list.first() - list.last())
}