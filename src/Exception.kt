import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    try {
        println(porcentagem(132))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println(lerIdade())
}

fun porcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero%"
    } else {
        throw IllegalArgumentException("O número $numero deve estar entre 1 e 100.")
    }
}

fun lerIdade(): Int? {
    val reader = FileReader(File("src/idade.txt"))
    val buffer = BufferedReader(reader)

    val idade = buffer.readLine()
    try {
        return Integer.parseInt(idade)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        buffer.close()
    }

}