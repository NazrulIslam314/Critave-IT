class User(private val userName: String, private val userEmail: String, private var age: Int) {
    constructor(userName: String, userEmail: String) : this(userName, userEmail, 0)

    fun display() {
        println("User: Name = $userName, Email = $userEmail, Age = $age")
    }
}