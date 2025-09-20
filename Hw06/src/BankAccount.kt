
class BankAccount(private val bank: MutableMap<String, Pair<Int, Double>> = mutableMapOf()) {
    init {
        println("......Welcome to your bank......")
    }

    fun createAccount(name: String, accountNumber: Int, deposit: Double) {
        bank[name] = Pair(accountNumber, deposit)
        println(bank)
    }

    fun deposit(accountName: String, amount: Double) {
        val accountNumber: Int = bank[accountName]?.first ?: -1
        val existingBalance: Double = bank[accountName]?.second ?: -1.0
        if (accountNumber != -1 && existingBalance != -1.0) {
            bank[accountName] = Pair(accountNumber, existingBalance + amount)
            println("$amount Deposit Successful. Your new balance is ${bank[accountName]?.second} ")
        } else {
            println("Account not found!!")
        }
    }

    fun withdrawal(accountName: String, amount: Double) {
        val minBalance = 500.0
        val accountNumber: Int = bank[accountName]?.first ?: -1
        val balance: Double = bank[accountName]?.second ?: -1.0
        if (accountNumber != -1 && balance != -1.0 && balance - amount >= minBalance) {
            bank[accountName] = Pair(accountNumber, balance - amount)
            println("$amount withdrawal Successful. Your new balance is ${bank[accountName]?.second} ")
        } else if (accountNumber == -1 || balance == -1.0) {
            println("Account not found!!")
        } else {
            println("Insufficient balance")
        }
    }
}
