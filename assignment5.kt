open class Manager{
    fun manage(){
        println("The manager can manage")
    }
}


class Employee : Manager(){
    fun work(){
        println("The employee can work")
    }

}

fun main(){
    var employee= Employee()

    employee.work()
    employee.manage()
}