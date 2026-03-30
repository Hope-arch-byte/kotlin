open class Shape{
    fun display(){
        println("This is a shape")
    }
}

class Circle(val radius:Double) :Shape(){
    fun area(){
        var area=22/7*radius*radius
        println("The area of the circle is $area")
    }
}

fun main(){
    var circle=Circle(7.0)
    circle.display()
    circle.area()
}
