fun main(){
//    var obj = Class_Object()
//    println("The sum is ${obj.add(5,10)}")
    println("The sum is ${Class_Object().add(5,10)}")
}

class Class_Object {
    var someValue = 10

    fun add(a: Int, b: Int) : Int{
        return a+b
    }
}