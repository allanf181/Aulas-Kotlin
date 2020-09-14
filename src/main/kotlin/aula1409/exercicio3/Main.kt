package aula1409.exercicio3

fun main() {
    val estoque = Estoque("Produto")
    println(estoque.mostrar())
    println(estoque.precisaRepor())
    println()
    estoque.mudarQtdMinima(50)
    println(estoque.mostrar())
    println(estoque.precisaRepor())
    println()
    estoque.repor(1000)
    println(estoque.mostrar())
    println(estoque.precisaRepor())
    println()
    estoque.darBaixa(293)
    println(estoque.mostrar())
    println(estoque.precisaRepor())
    println()
    estoque.mudarQtdMinima(-800)
    println(estoque.mostrar())
    println(estoque.precisaRepor())
    println()
    estoque.darBaixa(-758)
    println(estoque.mostrar())
    println(estoque.precisaRepor())
    println()
    estoque.repor(-50)
    println(estoque.mostrar())
    println(estoque.precisaRepor())
    println()
    estoque.mudarNome("Outro Produto")
    println(estoque.mostrar())
    println(estoque.precisaRepor())
    println()
}