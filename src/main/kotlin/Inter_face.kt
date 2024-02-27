import Inheritance.ClassB

fun main(){
    var classA = ClassA()
    classA.first_no = 5
    println("The value of variable is ${classA.first_no}")
    println("The Addition of two variable ${classA.Add(5,3)}")
    println("The Addition of three variable ${classA.Add(2,4,6)}")

    var classC = ClassC()
    classC.first_no = 10
    println("The value of variable is ${classC.first_no}")
    println("The multiplication and addition of two variable is ${classC.Add(10,20)}")
    println("The twice of three variable is ${classC.Add(10,5,6)}")
}

interface Add{
    var first_no : Int

    fun Add(a: Int, b: Int) : Int
    fun Add(a: Int, b: Int, c: Int) : Int
}

class ClassA: Add{ // here 'Add' is an interface
    override var first_no = 10
    override fun Add(a: Int, b: Int): Int {
        return a+b
    }

    override fun Add(a: Int, b: Int, c: Int): Int {
        return a+b+c
    }
}

class ClassC: Add{
    override var first_no = 20

    override fun Add(a: Int, b: Int): Int {
        return (a+a)*(b+b)
    }

    override fun Add(a: Int, b: Int, c: Int): Int {
        return 2*(a+b+c)
    }

}