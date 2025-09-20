package shoppingCart

class DigitalProduct(productName:String, quantity:Int,  price: Double): CartItem(productName, quantity, price)  {

    override fun cost(): Double {
        println("note: Digital product did not need shipping cost!")
        return super.cost()
    }
}