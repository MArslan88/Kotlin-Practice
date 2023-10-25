package functions
fun main(){
//    println("The sum is ${addition(3,5)}")
    val output = operation(
        5, 4,
        { a, b ->
            print("Adding these numbers ")
            a + b
        },
    )
    println(output)

}

//fun addition(a: Int, b: Int) : Int{
//    return a+b
//}

fun operation(a: Int, b: Int, operate: (Int, Int) ->Int) : Int{
    return operate(a, b)
}

