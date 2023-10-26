fun main(){
    var secondaryCons = SecondaryCons()
    var secondaryCons2 = SecondaryCons(5,4,5)
    var secondaryConsDef1 = SecondaryCons(8) // here a=8 and b will use its default value 20
    var secondaryConsDef2 = SecondaryCons(b=12) // here b=12 and a will use its default value 10


}

class SecondaryCons {
    constructor(a: Int = 10, b: Int = 20){ //here a=10 and b=20 is default values
        val sum = a+b
        println("Sum of Two : $sum")
    }

    constructor(a: Int, b: Int, c: Int){
        val sum = a+b+c
        println("Sum of Three : $sum")
    }
}