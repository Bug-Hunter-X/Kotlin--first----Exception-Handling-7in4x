fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //This will throw an exception if the list is empty
    val firstElement = list.first()
    println(firstElement)
}