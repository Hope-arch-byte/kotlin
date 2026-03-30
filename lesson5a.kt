//OOP - Object Oriented Programming
//is a way of organising ones data into objects and classes.

class Person{
    //attributes of person object
    var name="Joe"
    var age=20

    //behaviors of the object
    fun eat(){
        println("The person $name can eat")
    }
    fun walk (){
        println("The person $name can walk well because he is $age years old")
    }
    fun sleep(){
        println("$name can sleep")
    }
}

fun main(){
    val myObject=Person()
    myObject.eat()
    myObject.walk()
    myObject.sleep()
}

