package Loop

fun main(){
    val arr = arrayOf(52,10,-77,82,-67,-20)
    var i=0;
    while (i<arr.size){
        if(arr[i] > 0){
            println("Positive number : ${arr[i]}")
        }else{
            println("Negative number : ${arr[i]}")
        }
        i++
    }
}