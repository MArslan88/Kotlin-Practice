package Classes

fun main(){
//    var myClass = MyClass("Arslan", 36)
    var myClass = MyClass(age = 36, name = "Arslan")

    println("${myClass.name} is ${myClass.age} years old.")


    println("myValue is : ${ClassA(3).myValue}")
}


class MyClass {
    var name = ""
    var age = 0

    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }
}

class ClassA(a: Int){
    val myValue = 10
    init {
        println("My value is : $a")
    }
}