class Square{
    //attributes/state
    var length=5
    var width=5
    //properties/fxn
    fun areas(){
        var area=length*width
        println("The area of the square is $area")
    }
    fun peri(){
        var perimeter=(length+width)*2
        println("The perimeter of the square is $perimeter")
    }
}
fun main(){
    val myObject=Square()
    myObject.areas()
    myObject.peri()
}