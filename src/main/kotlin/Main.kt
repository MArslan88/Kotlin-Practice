fun main(args: Array<String>) {

    /*
    var (mutable: value can be reassign)
    val (immutable: value can not be reassign)
     */
//    var name = "Arslan"     // mutable
//    val name2 = "Danish"    // immutable
//    name = "Tanzeel"
//
//    println(name)
//    println(name2)


    /*
    String templates
     */

//    var name1 = "Ronny"
//    var name2 = "Mickey"
//
//    println("Both $name1 and $name2 are best friends");
//    println("${name1.toUpperCase()} is older than $name2");


    // IF-ELSE statements ----------------------------
//    val a=205
//    val b=195
//
//    val great = if(a>b)
//        "$a is greater"
//    else
//        "$b is greater"
//    println("$great")
//
//
//    // WHEN statement (it is similar to switch statement) ---------------------------------
//    var tap = 5
//    var order = when(tap){
//        1 -> "Pizze"
//        2 -> "Pasta"
//        3 -> "Fried rice"
//        4 -> "Wrap"
//        5 -> "Sandwich"
//        6 -> "Burger"
//        else -> "Invalid option"
//    }
//    println(order)

    var names = arrayOf("Arslan", "Danish", "Noman", "Tanzeel")

//    names.set(2,"Asif") // it will set the "Asif" at index '2'
//
//    println(names[1]) // for single data extraction
//    println(names.get(1)) // same as above

    // extract data with loop
    for(n in names){
        println(n)
    }
    names.forEach {
        println(it)
    }

//    var arr1 = arrayOf(2,4,6, "Eight", "ten")
//    for(element in arr1.indices){ // here indices use for index
//        println("arr1[$element] = " + arr1[element])
//    }
//
//    var arr2 = arrayOf(3,4,5,"Six", "Seven")
//    for(n in arr2){
//        println(n)
//    }

}