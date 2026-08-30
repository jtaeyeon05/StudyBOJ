fun main() {
    val alphabets = ('A' .. 'Z').toList()
    val case = MutableList(alphabets.size) { 0 }

    readln().uppercase().forEach {
        case[alphabets.indexOf(it)]++
    }

    val max = case.max()

    println(
        if (case.lastIndexOf(max) == case.indexOf(max)) alphabets[case.indexOf(max)]
        else "?"
    )
}