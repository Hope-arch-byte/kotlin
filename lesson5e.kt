open class Animal{
    fun eat(){
        println("The animal can eat")
    }
}
class Cat : Animal(){
    fun meow(){
        println("The cat can Meow")
    }
}
class Dog : Animal(){
    fun bark(){
        println("The dog can Bark")
    }
}

fun main() {
    val cat = Cat()
    val dog = Dog()

    cat.meow()
    cat.eat()

    dog.bark()
    dog.eat()
}