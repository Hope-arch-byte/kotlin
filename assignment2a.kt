fun main (){
    val points:Int=-5

    if(points>0 && points<=100){
        println("You do not qualify")
    }
    else if(points>100 && points<=400){
        println("You win a smartphone")
    }
    else if(points>400 && points<=1000){
        println("You win a laptop")
    }
    else if(points>1000){
        println("You win a trip to Canada")
    }
    else {
        println("Points are less than 0")
    }
}