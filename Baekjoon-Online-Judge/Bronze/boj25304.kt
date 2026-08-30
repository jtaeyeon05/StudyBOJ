fun main() {
    val price = readln().toInt()
    var priceT = 0

    repeat(readln().toInt()) {
        priceT += readln().split(" ").let{ it[0].toInt() * it[1].toInt() }
    }

    println(if (price == priceT) "Yes" else "No")
}