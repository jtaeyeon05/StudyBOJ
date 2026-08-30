fun main() {
    val correct = listOf(1, 1, 2, 2, 2, 8)
    readln().split(" ").forEachIndexed { index, item ->
        print("${correct[index] - item.toInt()} ")
    }
}