package functions

fun main(){
    println(addInline(3,6))
}

fun add(num1: Int, num2: Int) : Int{
    return num1 + num2
}

// we can use inline functions as well
fun addInline(num1: Int, num2: Int) = num1 + num2