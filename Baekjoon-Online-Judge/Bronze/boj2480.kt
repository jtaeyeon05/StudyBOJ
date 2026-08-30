fun main() {
    val value = readln().split(" ").let {
        Triple(it[0].toInt(), it[1].toInt(), it[2].toInt())
    }

    val a = value.first == value.second
    val b = value.second == value.third
    val c = value.third == value.first

    println(
        if (a && b) 10000 + value.first * 1000
        else if (a) 1000 + value.first * 100
        else if (b) 1000 + value.second * 100
        else if (c) 1000 + value.third * 100
        else {
            if (value.first > value.second) {
                if (value.first > value.third) value.first * 100
                else value.third * 100
            } else {
                if (value.second > value.third) value.second * 100
                else value.third * 100
            }
        }
    )
}