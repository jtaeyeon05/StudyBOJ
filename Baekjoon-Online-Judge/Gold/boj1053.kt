fun main() {
    val commandMap = mapOf(
        'R' to (1 to 0),
        'L' to (-1 to 0),
        'B' to (0 to -1),
        'T' to (0 to 1)
    )
    var (king, stone, n) = readln().split(" ").let { line ->
        Triple(
            line[0].let { it[0].code - 64 to it[1].digitToInt() },
            line[1].let { it[0].code - 64 to it[1].digitToInt() },
            line[2].toInt()
        )
    }

    repeat(n) {
        val command = readln()
        val action =
            if (command.length == 1) commandMap[command[0]]!!
            else commandMap[command[0]]!!.first to commandMap[command[1]]!!.second

        val newKing = actionDo(king, action)
        val newStone = actionDo(stone, action)
        if (king != newKing) {
            if (stone == newKing) {
                if (stone != newStone) {
                    king = newKing
                    stone = newStone
                }
            } else {
                king = newKing
            }
        }
    }

    println("${Char(king.first + 64)}${king.second}")
    println("${Char(stone.first + 64)}${stone.second}")
}

fun actionDo(target: Pair<Int, Int>, action: Pair<Int, Int>) =
    if (target.first + action.first in 1 .. 8 && target.second + action.second in 1 .. 8)
        target.first + action.first to target.second + action.second
    else target