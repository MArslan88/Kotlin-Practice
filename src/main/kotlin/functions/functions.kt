package functions
fun main(){
//    println("The sum is ${addition(3,5)}")
//    val output = operation(
//        5, 4,
//        { a, b ->
//            print("Adding these numbers ")
//            a + b
//        },
//    )
//    println(output)

//    println("Addition = ${operation(4,5)}")

    greeting("Arslan","Good Morning")
    // we can pass arguments with variables name also when position of variable is different
    greeting(greet = "Good Morning", name = "Arslan")
//    greeting()

}

//fun addition(a: Int, b: Int) : Int{
//    return a+b
//}

//fun operation(a: Int, b: Int, operate: (Int, Int) ->Int) : Int{
//    return operate(a, b)
//}

//fun operation(a: Int, b: Int) : Int {
//    return a + b
//}
//fun operation(a: Int, b: Int) : Int = a + b

fun greeting(name: String, greet: String = "Good Night"){
    println("Hello $name, $greet")
}


