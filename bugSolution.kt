fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //This will return null if the list is empty
    val firstElement = list.firstOrNull()
    println(firstElement)
    
    // Safer alternative: Check for emptiness before accessing
    if(list.isNotEmpty()){
        val firstElementSafe = list.first()
        println(firstElementSafe)
    }
}