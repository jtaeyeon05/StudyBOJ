import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readln().toInt()) {
        bufferedWriter.append("${bufferedReader.readLine().split(" ").sumOf { it.toInt() }}\n")
    }

    bufferedWriter.flush()
    bufferedWriter.close()
}