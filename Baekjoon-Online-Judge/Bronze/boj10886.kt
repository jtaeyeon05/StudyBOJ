fun main() {
    val people = readln().toInt()
    var cutePeople = 0
    repeat(people) { cutePeople += readln().toInt() }
    println("Junhee is ${if (cutePeople > people / 2) "" else "not "}cute!")
}