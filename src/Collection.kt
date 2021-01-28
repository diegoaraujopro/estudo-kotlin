fun main() {
    // ArrayList = Classe
    val frutas1 = ArrayList<String>()
    frutas1.add("Maçã")
    frutas1.add("Uva")
    frutas1.add("Melância")

    // ArrayList = Função
    val frutas2 = arrayListOf("Maçã", "Uva", "Melância")


    println(frutas1)
    println(frutas2)

    // Vamos confirmar de fato, que as coleções são da biblioteca Java padrão
    println(HashSet::class.java)

    // Podemos tirar muito mais proveito das coleções em Kotlin
    println(frutas2.last())

    val numero = setOf(2, 20, 45, 32)
    println(numero.maxOrNull())

}