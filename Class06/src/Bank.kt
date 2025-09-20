class Bank(private val accName: String, private val accNumber: Int, private var balance: Double) {
    val minBalance = 500
    fun createAccount(accName: String, accNumber: Int) {
        if (balance >= minBalance) {
            balance += balance
            println("Welcome to our Bank, $accName, Your Account Number is $accNumber, Your balance is $balance")
        }

    }

    fun deposit(amount: Double) {
        balance += amount
        println("Hello $accName, you deposit $amount in your account, Your balance is $balance")
    }

    fun withdraw(amount: Double) {

        if (balance - amount >= minBalance) {
            balance -= amount
            println("Hello $accName, you withdraw $amount in your account, Your balance is $balance ")
        } else {
            println("you have inefficient balance")
        }

    }
    fun checkBalance(){
        println("Your account balance is $balance")
    }
}