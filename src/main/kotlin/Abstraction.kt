
fun main(){

}

abstract class abstClass{
    var name: String = "Danish"
    abstract var branch: String

    fun Add(a: Int, b:Int) : Int{
        return a+b
    }

    abstract fun operator(a: Int, b: Int) : Int
}

class MyClass : abstClass(){
    override var branch = "Karachi"

    override fun operator(a: Int, b: Int): Int {
        return a+b
    }

}