fun main(){
    add(50,70)
    subtraction(70,20)
    division(18,3)
    modulus(10,6)
    multiplication(2,3)
    simpleInterest(5000,5,2)
    bmi(70,1.7)
    alphabet()
}
fun add(num1:Int,num2:Int){
    val sum=num1+num2
    println("The sum is $sum")
}
fun subtraction(num1:Int,num2:Int){
    val difference=num1-num2
    println("The difference is $difference")
}
fun division(num1:Int,num2:Int){
    val quotient=num1/num2
    println("The quotient is $quotient")
}
fun modulus(num1:Int,num2:Int){
    val remainder=num1%num2
    println("The remainder is $remainder")
}
fun multiplication(num1:Int,num2:Int){
    val product=num1*num2
    println("The product is $product")
}
fun simpleInterest(p:Int,r:Int,t:Int){
    val interest=p*t*r/100
    println("The simple interest is $interest")
}
fun bmi(m:Int,h:Double){
    val bodyMassIndex=m/(h*h)
    println("The bmi is $bodyMassIndex")
}
fun alphabet(){
    for (letters in 'a'..'z'){
        println(letters)
    } 
}