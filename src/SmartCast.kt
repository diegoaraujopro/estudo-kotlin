
interface Expressao
class Numero(val numero: Int) : Expressao
class Soma(val a: Expressao, val b: Expressao) : Expressao

//fun avaliacao(expressao: Expressao): Int {
//    if (expressao is Numero) {
//        return expressao.numero
//    }
//
//    if (expressao is Soma) {
//        return avaliacao(expressao.a) + avaliacao(expressao.b)
//    }
//
//    throw IllegalArgumentException("Expressão é desconhecida")
//}

// Mesmo código acima, porém refatorado
fun avaliacao(expressao: Expressao): Int =
    when(expressao) {
        is Numero -> expressao.numero
        is Soma -> avaliacao(expressao.a) + avaliacao(expressao.b)
        else -> throw  IllegalArgumentException("Expressão é desconhecida")
    }


fun main() {
    val avaliar = avaliacao(Soma(Soma(Numero(3), Numero(4)),Numero(3)))
    println(avaliar)
}