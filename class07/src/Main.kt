class Teacher(override var name : String, override var age: Int) : Human(name, age) {
    fun teach() {
        println("$name, sir, is teaching now")
    }
    override fun eat(){
        println("$name, are eating 6:00 P.M")
    }
    override fun eat(location: String){
        println("$name, are eating 6:00 P.M, in $location")
    }

}

class Student(override var name: String, override var age: Int) : Human(name, age) {
    fun learn() {
        println("$name, sir, is teaching now")
    }
    override fun eat(){
        println("$name, are eating 4:00 P.M")
    }
}

 open class Human(open var name: String, open var age: Int) {
    open fun eat() {
        println("$name, are eating now")
    }

    open fun sleep() {
        println("$name, are sleeping now")
    }
    open fun eat(location:String){
         println("$name, are eating now in $location")
     }
}

fun main(){
    val t1 = Teacher("jocular", 50)
    val s1 = Student("atrule", 50)
    t1.eat()
    t1.eat("Hotel")
    t1.sleep()
    s1.eat()
    s1.eat("Home")
    s1.sleep()
    val h1= Human("Nazrul", 22)
    h1.eat()
    h1.sleep()
}