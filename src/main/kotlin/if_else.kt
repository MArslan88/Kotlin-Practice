fun main(){
//    val marks = 130
//
//    val result = if(marks < 105 && marks > 80){
//        "Cutoff not cleared( 2nd Exam)"
//    }else if(marks in 105..130){
//        "Cutoff cleared"
//    }else if(marks in 130..180){
//        "Cutoff cleared (No fee)"
//    }else{
//        "Cutoff not cleared"
//    }
//    println(result)

    var num = 11
    var msg = ""

    // for single line no need to use curly brackets
//    if(num > 100)
//        println("Number is Greater!")
//    else
//        println("Number is Smaller!")


    // use condition as variable statement as turnery operator
    msg = if(num > 100) "Number is Greater!" else "Number is Smaller!"
    println(msg)
}