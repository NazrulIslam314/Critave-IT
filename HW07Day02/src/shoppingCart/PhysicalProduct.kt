package shoppingCart

class PhysicalProduct(productName:String, quantity:Int,  price: Double): CartItem(productName, quantity, price)  {

    override fun cost(): Double {
        // Added a static shipping cost for physical product.
        val shippingCost = 70.0
        println("note: $shippingCost shipping cost are added. total price: ${super.cost()+shippingCost}")
        return super.cost()+shippingCost
    }
}