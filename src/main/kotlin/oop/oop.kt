package oop

fun main(){
    val p1 = Person("Ali")
    println(p1.name)
}

//class Person(_name: String){
//    val name: String
//    init{
//        name = _name
//    }
//}


class Person(val name: String)