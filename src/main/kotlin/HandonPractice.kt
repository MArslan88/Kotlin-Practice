fun main(){

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val totalCount = numbers.count()                     // 2
    val evenFilter = numbers.filter { it % 2 == 0 }        // 3
    val evenCount = numbers.count { it % 2 == 0 }        // 3

    println("Total elements: $numbers")
    println("Total number of elements: $totalCount")
    println("Even elements: $evenFilter")
    println("Number of even elements: $evenCount")

    for (element in numbers){
        println(element)
    }



}