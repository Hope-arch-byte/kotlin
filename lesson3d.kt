fun main(){
    //looping thru an array of items

    var colors = arrayOf("Blue","Yellow","Black","Purple","Brown")
    for (color in colors){ //print one item in an array.
        println(color)
    }

println("................................")

    var planets = arrayOf("Mercury","Venus","Earth","Mars","Jupiter","Sarturn","Uranus","Neptune")
    for (planet in planets){
        println(planet)
    }

    println("................................")

    var numbers=arrayOf(10,20,30,40)
    numbers[0]=50  //used to update the array
    println(numbers.joinToString())  //output is in string form.


}