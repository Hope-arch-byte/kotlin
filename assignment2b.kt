fun main (){
    //Using if statement or when statement, create a program to find if given year is leap or not.
    
    var year=2012
    if(year%4==0){
        println("This is a leap year")
    }

    val years=1998
    when(years%4){ //In brackets is the condition inside when is what is after the equal sign.
        0->println("This is a leap year")
            else->println("not leap year")     
    } 
    //alt method

    // when{ 
    //     (years%4==0)->println("This is a leap year")
    //         else->println("not leap year")     
    // }

    
    //use if statement to check whether a number is odd or even
    var num=2
    
    if(num%2==0){
        println("The number is even")
    }

    val number=1
    if (number%2!==0){
        println("The number is odd")
    }

}