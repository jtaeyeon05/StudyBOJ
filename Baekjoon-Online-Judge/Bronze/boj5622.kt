fun main() {
    val dialList = listOf(
        listOf('A', 'B', 'C'), // 2
        listOf('D', 'E', 'F'), // 3
        listOf('G', 'H', 'I'), // 4
        listOf('J', 'K', 'L'), // 5
        listOf('M', 'N', 'O'), // 6
        listOf('P', 'Q', 'R', 'S'), // 7
        listOf('T', 'U', 'V'), // 8
        listOf('W', 'X', 'Y', 'Z') // 9
    )
    var result = 0
    readln().forEach { char ->
        dialList.forEachIndexed { index, dial ->
            if (dial.contains(char))
                result += index + 3
        }
    }
    println(result)
}