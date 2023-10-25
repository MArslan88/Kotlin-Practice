package Loop

fun main(){
    var myList = listOf<Int>(10,20,30)
    var sum = 0
    myList.forEach{
        sum = sum + it
    }
    println(sum)
}