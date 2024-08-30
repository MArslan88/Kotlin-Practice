import kotlin.math.abs

fun main(){

//    var name = "Muhammad Arslan"
//    println("Hello $name")
//
//    var myName: String? = "abc"
//
//    println("my new name is : $myName")

//    var age = 17
//    if(age>=18){
//        print("You can vote")
//    }else{
//        print("You cannot vote!")
//    }


//    // we can assign conditional statements into the variable
//    var age = 18
//    val message: String = if(age>=18){
//        return print("You can vote")
//    }else{
//        return print("you cannot vote")
//    }
//    println(message)


//    // when statement is just like a switch statement in java
//    var name = "Arslan"
//    when(name){
//        "Arslan"->{
//            println("i have found your name: $name")
//        }
//        "Hello"->{
//            println("No this one is not your name")
//        }else->{
//            println("jb kuch bhi same na ho to else chale ga")
//        }
//    }


//    // Array in Kotlin
//    var names = arrayOf("Arslan", "Danish", "Tanzeel","Noman")
//    for(name in names){
//        println(name)
//    }
//
//    names.forEach { println(it) }


//    val cakes = listOf("carrot", "cheese", "chocolate")
//
//    for (cake in cakes) {
//        println("Yummy, it's a $cake cake!")
//    }


    // Ranges

//    for (i in 0..3){
//        print(i)
//    }
//    print(" ")
//    for(i in 2..8 step 2){
//        print(i)
//    }
//    print(" ")
//    for(i in 3 downTo 0){
//        print(i)
//    }
//    println()
//
//    val x=5
//    if(x in 1..5){
//        println("x is in range from 1 to 5")
//    }
//    if(x !in 1..5){
//        println("x is not in range from 1 to 5")
//    }
//    if(x !in 6..10){
//        println("x is not in range from 6 to 10")
//    }

    // collection (Map)
//    val readOnlyJuiceMenu = mapOf("Apple" to 190, "Mango" to 250, "Kiwi" to 180, "Banana" to 100)
////    println(readOnlyJuiceMenu)
////    println("The value of apple juice is : ${readOnlyJuiceMenu["Apple"]}")
//
//    for(menu in readOnlyJuiceMenu){
//        println("The value of ${menu.key} juice is : ${menu.value}")
//    }


    // Equality checks
//    val authors = setOf("Shakespeare", "Hemingway", "Twain")
//    val writers = setOf("Twain", "Shakespeare", "Hemingway")
//
//    println(authors == writers)   // 1
//    println(authors === writers)  // 2

    // Condition statements
//    fun max(a: Int, b: Int) = if (a > b) a else b         // 1
//
//    println(max(99, -42))


    // List in Kotlin
//    var names = listOf("Kashif", "Danish", "Tanzeel","Noman")
//    var names = mutableListOf("Kashif", "Danish", "Tanzeel","Noman")
//    names[4] = "new name"
//    for(name in names){
//        println(name)
//    }

//    names.forEach {
//        println(it)
//    }

//    val values = listOf(1,2,3)
//    println("Numbers: $values , min = ${values.min()}, max = ${values.max()}")


    // Filter

//    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1
//
//    val positives = numbers.filter { x -> x > 0 }  // 2
//    val even = numbers.filter { it % 2 == 0 }
//
//    val negatives = numbers.filter { it < 0 }      // 3
//
//    println("Numbers: $numbers")
//    println("Positive Numbers: $positives")
//    println("Negative Numbers: $negatives")
//    println("Even Numbers: $even")


    // map
//    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1
//
//    val doubled = numbers.map { x -> x * 2 }      // 2
//
//    val tripled = numbers.map { it * 3 }          // 3
//
//    println("Numbers: $numbers")
//    println("Doubled Numbers: $doubled")
//    println("Tripled Numbers: $tripled")


    // Any
//    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
//
//    val anyNegative = numbers.any { it < 0 }             // 2
//
//    val anyGT6 = numbers.any { it > 6 }                  // 3
//
//    println("Numbers: $numbers")
//    println("Is there any number less than 0: $anyNegative")
//    println("Is there any number greater than 6: $anyGT6")


//    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
//
//    val allEven = numbers.all { it % 2 == 0 }            // 2
//
//    val allLess6 = numbers.all { it < 6 }                // 3
//
//    println("Numbers: $numbers")
//    println("All numbers are even: $allEven")
//    println("All numbers are less than 6: $allLess6")


//    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
//
//    val allEven = numbers.none { it % 2 == 1 }           // 2
//
//    val allLess6 = numbers.none { it > 6 }               // 3
//
//    println("Numbers: $numbers")
//    println("All numbers are even: $allEven")
//    println("No element greater than 6: $allLess6")


//    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1
//
//    val first = words.find { it.startsWith("some") }                                // 2
//    val last = words.findLast { it.startsWith("some") }                             // 3
//
//    val nothing = words.find { it.contains("nothing") }                             // 4
//
//    println("$words")
//    println("The first word starting with \"some\" is \"$first\"")
//    println("The last word starting with \"some\" is \"$last\"")
//    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")


//    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
//
//    val first = numbers.first()                          // 2
//    val last = numbers.last()                            // 3
//
//    val firstEven = numbers.first { it % 2 == 0 }        // 4
//    val lastOdd = numbers.last { it % 2 != 0 }           // 5
//
//    println("Numbers: $numbers")
//    println("First $first, last $last, first even $firstEven, last odd $lastOdd")



//    val words = listOf("foo", "bar", "baz", "faz")         // 1
//    val empty = emptyList<String>()                        // 2
//
//    val first = empty.firstOrNull()                        // 3
//    val last = empty.lastOrNull()                          // 4
//
//    val firstF = words.firstOrNull { it.startsWith('f') }  // 5
//    val firstZ = words.firstOrNull { it.startsWith('z') }  // 6
//    val lastF = words.lastOrNull { it.endsWith('f') }      // 7
//    val lastZ = words.lastOrNull { it.endsWith('z') }      // 8
//
//    println("Empty list: first is $first, last is $last")
//    println("Word list: first item starting with 'f' is $firstF, first item starting with 'z' is $firstZ")
//    println("Word list: last item ending with 'f' is $lastF, last item ending with 'z' is $lastZ")



//    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
//
//    val totalCount = numbers.count()                     // 2
//    val evenCount = numbers.count { it % 2 == 0 }        // 3
//
//    println("Total number of elements: $totalCount")
//    println("Number of even elements: $evenCount")


//    val shuffled = listOf(5, 4, 2, 1, 3, -10)                   // 1
//    val natural = shuffled.sorted()                             // 2
//    val inverted = shuffled.sortedBy { -it }                    // 3
//    val descending = shuffled.sortedDescending()                // 4
//    val descendingBy = shuffled.sortedByDescending { abs(it)  } // 5
//
//    println("Shuffled: $shuffled")
//    println("Natural order: $natural")
//    println("Inverted natural order: $inverted")
//    println("Inverted natural order value: $descending")
//    println("Inverted natural order of absolute values: $descendingBy")

    val A = listOf("a", "b", "c")                  // 1
    val B = listOf(1, 2, 3, 4)                     // 1

    val resultPairs = A zip B                      // 2
    val resultReduce = A.zip(B) { a, b -> "$a$b" } // 3

    println("A to B: $resultPairs")
    println("\$A\$B: $resultReduce")

//    data class Person(val name: String, val city: String, val phone: String) // 1
//
//    val people = listOf(                                                     // 2
//        Person("John", "Boston", "+1-888-123456"),
//        Person("Sarah", "Munich", "+49-777-789123"),
//        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
//        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))
//
//    val phoneBook = people.associateBy { it.phone }                          // 3
//    val cityBook = people.associateBy(Person::phone, Person::city)           // 4
//    val peopleCities = people.groupBy(Person::city, Person::name)            // 5
//    val lastPersonCity = people.associateBy(Person::city, Person::name)      // 6
//
//
//    println("People: $people")
//    println("Phone book: $phoneBook")
//    println("City book: $cityBook")
//    println("People living in each city: $peopleCities")
//    println("Last person living in each city: $lastPersonCity")

}