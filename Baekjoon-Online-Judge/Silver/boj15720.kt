fun main() {
    val min = readln().split(" ").map { it.toInt() }.min()
    val menus = List(3) { readln().split(" ").map { it.toInt() }.sortedDescending() }
    val setMenus = List(3) { listIndex ->
        var sum = 0
        for (index in menus[listIndex].indices) {
            sum += if (index < min) menus[listIndex][index] * 9 / 10
            else menus[listIndex][index]
        }
        sum
    }

    println(menus[0].sum() + menus[1].sum() + menus[2].sum())
    println(setMenus[0] + setMenus[1] + setMenus[2])
}