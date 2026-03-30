fun main (){
    //if else if else statement
    val marks:Int=120
    
    if(marks<=30){
        println("Below average")
    }
    else if(marks>30 && marks<=50){
        println("Average")
    }
    else if(marks>50 && marks<=70){
        println("Above average")
    }
    else if(marks>70 && marks<=100){
        println("You passed")
    }
    else{
        println("Invalid marks")
    }
}