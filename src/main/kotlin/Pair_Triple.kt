fun main (){

//    var (a, b) = Pair("myKey", 1)
//    println("Key: $a Value: $b")


    var list = Pair("Name", Pair("Kashif","Danish"))

    println("${list.first} is ${list.second.first}")
    println("${list.first} is ${list.second.second}")
}