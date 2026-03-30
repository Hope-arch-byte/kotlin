fun main(){
    //write a fxn that takes in number n and print all numbers from n downwards.
    numbers(10)

}
fun numbers(n:Int){
    // var num=n
    // while(n<=num){
    //     println(num)
    //     num--
    // }
    for (num in n downTo 1){
        println("$num")
    }
}