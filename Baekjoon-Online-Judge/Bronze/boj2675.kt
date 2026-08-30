fun main() {
    repeat(readln().toInt()) {
        readln().split(" ").let { info ->
            info[1].forEach {
                print(it.toString().repeat(info[0].toInt()))
            }
            println()
        }
    }
}