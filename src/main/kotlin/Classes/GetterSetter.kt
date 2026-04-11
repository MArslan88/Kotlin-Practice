package Classes

fun main(){
    val p1 = Person("Arslan", 38)
    println(p1.age)
    p1.age = -8

    println(p1.name)


}

class Person(nameParam: String, ageParam: Int){
    var name: String = nameParam
        get(){
            return field.uppercase()
        }

    var age: Int = ageParam
        set(value) {
            if(value > 0){
                field = value
            } else {
                println("Age can't be -ve")
            }
        }
}