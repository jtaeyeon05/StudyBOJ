fun main() {
    var list = mutableListOf<String>()
    repeat(readln().toInt()) {
        if (list == mutableListOf<String>()) list = readln().split("").toMutableList()
        else {
            readln().split("").forEachIndexed { index, char ->
                if (char != list[index]) list[index] = "?"
            }
        }
    }
    println(list.joinToString(""))
}