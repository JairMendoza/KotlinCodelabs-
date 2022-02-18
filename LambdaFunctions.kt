fun main() {
    //val triple: (Int) -> Int = { a: Int -> a * 3 }
    //La parte de abajo hace lo mismo que lo de arriba solo que esta abreviado.
    val triple: (Int) -> Int = { it * 3 }
    println(triple(5))
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })

}