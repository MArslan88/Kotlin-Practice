package Classes

fun main(){
    var cc = CompanionClass()
    // need an object
    println("First value is : ${cc.firstValue}")
    println("Sum is : ${cc.add(4,5)}")

    // no need of an object for companion object
    println("Second Value is : ${CompanionClass.secondValue}")
    println("Product is : ${CompanionClass.product(5, 10)}")
}


class CompanionClass {
    var firstValue = 10;
    fun add(a: Int, b: Int) : Int{
        return a+b
    }

    // it will work just like static key word in java
    companion object{
        var secondValue = 20
        fun product(a: Int, b: Int) : Int{
            return a*b
        }
    }
}