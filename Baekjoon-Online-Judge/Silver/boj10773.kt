fun main() {
    val arrayList = arrayListOf<Int>()

    repeat(readln().toInt()) {
        readln().toInt().let {
            if (it == 0) arrayList.removeLastOrNull()
            else arrayList.add(it)
        }
    }

    println(arrayList.sum())
}