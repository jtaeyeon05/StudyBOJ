fun main() {
    loop@ while (true) {
        val number = readln()
        var isPalindrome = true

        if (number == "0") break@loop

        palindromeLoop@ for (index in 0 .. number.length / 2) {
            if (number[index] != number[number.length - index - 1]) {
                isPalindrome = false
                break@palindromeLoop
            }
        }

        println(if (isPalindrome) "yes" else "no")
    }
}