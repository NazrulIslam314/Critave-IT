package shopping

open class CartItem {
    private val cart: MutableMap<String, Pair<Int, Double>> = mutableMapOf()

    fun add(productName: String, quantity: Int, price: Double) {
        if (cart.containsKey(productName)) {
            val currentQuantity = cart[productName]?.first ?: 0
            cart[productName] = Pair(currentQuantity + quantity, price)
        } else {
            cart[productName] = Pair(quantity, price)
        }
    }


    fun showCart() {
        if (cart.isEmpty()) {
            println("Cart is empty")
        } else {
            cart.forEach { (productName, item) ->
                val (quantity, price) = item
                println("$productName: $quantity pieces $price each")
            }
        }
    }

    open fun totalCost(): Double {
        return cart.values.sumOf { (quantity, price) -> quantity * price }
    }
}

class DigitalProducts : CartItem() {
    override fun totalCost(): Double {
        return super.totalCost()
    }
}


class PhysicalProducts : CartItem() {
    var shippingCost: Double = 0.0

    override fun totalCost(): Double {
        return super.totalCost() + shippingCost
    }
}
