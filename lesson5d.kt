open class Vehicle{
    fun move(){
        println("The vehicle can move")
    }

}

class Car:Vehicle(){
    fun hoot(){
        println("The car can hoot")
    }
}


fun main(){
    val obj=Car()
    obj.hoot()
    obj.move()
}

