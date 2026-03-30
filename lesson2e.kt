fun main (){
    val marks:Int=20
    
    when(marks){
        in 0..30->println("Below average")
        in 31..50->println("Average")
        in 51..70->println("Above avreage")
        in 71..100->println("you passed")       

            else->println("Invalid marks")
    }

    val day=4

    when(day){
        1->println("Monday")
        2->println("Tuesday")
        3->println("Wednesday")
        4->println("Thursday")
        5->println("Friday")
        6->println("Saturday")
        7->println("Sunday")
            else->println("Invalid index")
    }
}