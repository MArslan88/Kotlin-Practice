package Classes

fun main(){
    var car1 = Vehicle("Mustang", 4, 5, "Petrol")
    var car2 = Vehicle("Corolla", "Petrol")

    println(car2.name)
    println(car2.type)
    println(car2.maxSeating)
    println(car2.enginType)
}

class Vehicle(val name: String, val type: Int, val maxSeating: Int, val enginType: String){
    init {
        println("Class initialized")
    }

    // secondary constructor
    constructor(nameParam: String, enginParam: String) :
            this(nameParam, 4, 5, enginParam) // this is primary constructor


}