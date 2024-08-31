package Classes

fun main(){
    var obj = Class_Object(4)
//    println("The sum is ${obj.add(5,10)}")
    println("The sum is ${obj.add(5,10)}")
    println("${obj.someValue}")
}

class Class_Object(var val1: Int) {
    var someValue = 10 + val1
    init{
        println("val1 : $val1")
    }

    fun add(a: Int, b: Int) : Int{
        return a+b
    }
}