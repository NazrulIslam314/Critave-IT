class ShoppingCart(private val items: MutableMap<String, Pair<Double, Int>> = mutableMapOf()) {
    fun add(itemName: String, price: Double) {
        if (items.contains(itemName)) {
            val quantity: Int = items[itemName]?.second ?: 0
            items[itemName] = Pair(price, quantity + 1)
            println("$itemName are updated to your shopping cart \n $items")
        } else {
            items[itemName] = Pair(price, 1)
            println("$itemName are added to your shopping cart \n $items")
        }
    }

    fun displayAll() {
        for (item in items) {
            val itemName = item.key
            val itemPrice = item.value.first
            val itemQuantity = item.value.second
            val itemTotalPrice = itemPrice * itemQuantity
            println("$itemName $itemQuantity x $itemPrice = $itemTotalPrice")
        }
    }

    fun totalPrice() {
        var totalCartPrice = 0
        for (item in items) {
            val itemName = item.key
            val itemTotalPrice = item.value.first * item.value.second
            totalCartPrice += itemTotalPrice.toInt()
        }
        println("Total price is: $totalCartPrice")
    }
}
