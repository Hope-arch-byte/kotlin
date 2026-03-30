//inheritance - subclass inheriting from the superclass
open class Animal{ //super class
    fun eat(){
        println("The animal can eat")
    }
}

class Dog:Animal(){ //sub class
    fun bark(){
        println("The dog can bark")
    }
}

fun main(){
    val obj=Dog()
    obj.eat()
    obj.bark()
}