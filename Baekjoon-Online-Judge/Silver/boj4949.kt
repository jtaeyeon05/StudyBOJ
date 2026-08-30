fun main() {
    var realData = ""
    loop@ while (true) {
        val data = readln()
        val starts = arrayListOf<Char>()

        var isDC = true

        if (data == ".") break@loop

        if (!data.endsWith(".")) {
            realData += data
        } else {
            realData += data

            realData.forEach {
                when (it) {
                    '(', '[' -> starts.add(it)
                    ')' -> {
                        if (starts.isEmpty() || starts.last() != '(') {
                            isDC = false
                            return@forEach
                        } else {
                            starts.removeLast()
                        }
                    }
                    ']' -> {
                        if (starts.isEmpty() || starts.last() != '[') {
                            isDC = false
                            return@forEach
                        } else {
                            starts.removeLast()
                        }
                    }
                }
            }
            if (starts.isNotEmpty()) isDC = false

            realData = ""

            println(if (isDC) "yes" else "no")
        }
    }
}