fun main() {
    //val triple: (Int) -> Int = { a: Int -> a * 3 }
    //La parte de abajo hace lo mismo que lo de arriba solo que esta abreviado.
    val triple: (Int) -> Int = { it * 3 }
    println(triple(5))
}