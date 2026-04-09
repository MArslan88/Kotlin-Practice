package Classes

fun main(){
    val mustang = Car("Mustang", "Petrol", 2000)
    val beetle = Car("Beetle", "Diesel", 3000)

    println(mustang.name)
    println(mustang.type)
    println(mustang.millage)

    mustang.driveCar()
    beetle.breakCar()
}

class Car(val name: String, val type: String, var millage: Int){

    fun driveCar(){
        println("$name is driving")
    }

    fun breakCar(){
        println("$name is breaking")
    }

}