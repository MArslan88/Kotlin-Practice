package Interface

fun main() {
    var classA = ClassA()
    println("The number is : ${classA.firstNo}")
    println("The sum of two number is : ${classA.Add(5, 6)}")


    var classB = ClassB()
    println("The number is : ${classB.firstNo}")
    println("The sum of two number is : ${classB.Add(5, 6)}")
}

interface Add {
    // abstract variable
    var firstNo: Int

    // abstract functions
    fun Add(a: Int, b: Int): Int

    fun Add(a: Int, b: Int, c: Int): Int
}

// to use interface the same ':' symbol is use for inheritance and interface both
class ClassA : Add {
    override var firstNo = 10

    override fun Add(a: Int, b: Int): Int {
        return a + b
    }

    override fun Add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}


// to use interface the same ':' symbol is use for inheritance and interface both
class ClassB : Add {
    override var firstNo = 12

    override fun Add(a: Int, b: Int): Int {
        return a + b + firstNo
    }

    override fun Add(a: Int, b: Int, c: Int): Int {
        return a + b + c + firstNo
    }
}