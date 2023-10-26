package Inheritance

fun main() {
    var classB = ClassB()
    println("The name is : ${classB.name}")
    println("The sum is : ${classB.Add(4, 5)}")
}

open class ClassA { // parent class
    var name = "Danish"

    fun Add(a: Int, b: Int): Int {
        return a + b
    }
}

// to inherit parent class it should be open and with default constructor
class ClassB : ClassA() { // child class inherit with ClassA


}