fun main() {
    val line = readln()

    var target = line.split(" ")[1].toInt()
    val coinList = List(line.split(" ")[0].toInt()) { readln().toInt() }.reversed()

    var case = 0

    for (coin in coinList) {
        case += target / coin
        target %= coin
    }

    println(case)
}