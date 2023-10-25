package Loop

fun main(){
    var num = arrayOf(7,8,9,21,16,32,65,85,12,25,45)
    println("The Odd and Even numbers are as follows : ")

    for(item in num){
        if(item%2 == 0){
            println("Even number : $item")
        }else{
            println("Odd number : $item")
        }
    }
}