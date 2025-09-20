package shoppingCart


open class CartItem(var productName: String, var quantity: Int, var price: Double) {

    init {
        println("- $quantity $productName added to cart")

        // we use cost function for calculate price of all type of products
        this.price = cost()
    }

   open fun cost(): Double {
       return price * quantity
    }

}