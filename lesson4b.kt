fun main (){
    add()
    subtraction()
    division()
    modulus()
    multiplication()
    simpleInterest()
    bmi()

}
fun add(){
    val num1=15
    val num2=20
    val sum=num1+num2
    println("The sum is $sum")
}
fun subtraction(){
    val num1=15
    val num2=20
    val difference=num2-num1
    println("The difference is $difference")
}
fun division(){
    val num1=15
    val num2=5
    val quotient=num1/num2
    println("The quotient is $quotient")
}
fun modulus(){
    val num1=20
    val num2=3
    val remainder=num1%num2
    println("The remainder is $remainder")
}
fun multiplication(){
    val num1=15
    val num2=20
    val product=num1*num2
    println("The product is $product")
}
fun simpleInterest(){
    val p=5000
    val r=5
    val t=2
    val interest=p*t*r/100
    println("The simple interest is $interest")
}
fun bmi(){
    val m=70
    val h=1.7
    val bodyMassIndex=m/(h*h)
    println("The bmi is $bodyMassIndex")
}
