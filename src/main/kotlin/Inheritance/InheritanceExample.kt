package Inheritance

fun main() {
    Car().VehicleRun()
    Car().VehicleRun("Toyota", 2024, "Black")

}

open class Vehicle { // parent class
    open var name = "Car" // to override this name, we use open key word with this
    var model = 2017
    var color = "Red"

    fun VehicleRun() {
        println("Vehicle Details")
        println("Name: $name")
        println("Model: $model")
        println("Color: $color")
    }

    fun VehicleRun(name: String, model: Int, color: String) {
        println("Vehicle Details")
        println("Name: $name")
        println("Model: $model")
        println("Color: $color")
    }
}

class Car : Vehicle() { // child class
    // to override any variable or function, you need to use open key word with
// variable or function name in parent class
    override var name = "abc"

}
