fun main() {
    var count = 0
    for (number in 1 .. readln().toInt()) {
        var num = number
        while (num % 5 == 0) {
            count++
            num /= 5
        }
    }
    println(count)
}

