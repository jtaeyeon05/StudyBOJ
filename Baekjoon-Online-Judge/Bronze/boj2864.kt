fun main() {
    readln().split(" ").let {
        println("${it[0].replace("6", "5").toInt() + it[1].replace("6", "5").toInt()} ${it[0].replace("5", "6").toInt() + it[1].replace("5", "6").toInt()}")
    }
}