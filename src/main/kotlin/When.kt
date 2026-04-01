fun main(){
    val animal = "Cat"
//    if(animal == "Horse"){
//        println("Animal is $animal")
//    } else if(animal == "Cat"){
//        println("Animal is $animal")
//    } else if(animal == "Dog"){
//        println("Animal is $animal")
//    } else{
//        println("Animal not found")
//    }

//    when(animal){
//        "Horse" -> println("Animal is $animal")
//        "Cat" -> println("Animal is $animal")
//        "Dog" -> println("Animal is $animal")
//        else -> println("Animal not found")
//    }

//    val result = when(animal){
//        "Horse" -> "Animal is $animal"
//        "Cat" -> "Animal is $animal"
//        "Dog" -> "Animal is $animal"
//        else -> "Animal not found"
//    }
//
//    println(result)


    val number = 13
    val result = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "teen"
        else -> "Not in range"
    }

    println(result)
}