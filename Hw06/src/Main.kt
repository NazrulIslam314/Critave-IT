fun main(){
// Book
    val book1 = Book("New Book", "Nazrul")
    val book2 = Book("Book2", "Nazrul", 2025)
//    Bank Account
    val b1 = BankAccount()
    b1.createAccount("Nazrul", 1, 500.0)
    b1.createAccount("Alve", 2, 500.0)
    b1.deposit("Nazrul", 500.0)
    b1.withdrawal("Nazrul", 500.0)
//  User System
    val u1 = User("Nazrul", "nazrulislam3144@gmail.com", 22)
    val u2 = User("Alvie", "nazrulislam3144personal@gmail.com")
    u1.display()
    u2.display()
//  Shopping
    val s1 = ShoppingCart()
    s1.add("Clock", 299.0)
    s1.add("Clock", 299.0)
    s1.add("Watch", 999.0)
    s1.add("Bag", 259.0)
    s1.displayAll()
    s1.totalPrice()
}