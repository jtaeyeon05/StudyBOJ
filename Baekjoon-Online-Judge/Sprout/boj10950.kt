fun main() {
    var caseSize = readln().toInt()
    while (caseSize-- > 0) {
        println(readln().split(" ").let { it[0].toInt() + it[1].toInt() })
    }
}