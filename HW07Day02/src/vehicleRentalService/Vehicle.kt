package vehicleRentalService


open class Vehicle(private var make: String, private var model: String, private var rentPerDay: Double) {

    var isRanted = false

    open fun rent(rentedForDays: Int): Double {
        if (isRanted) {
            println("Fail!, The $make $model ${vehicleType()}  is rented by other")
        } else {
            isRanted = true
            println("Success, The $make $model ${vehicleType()} is rented ")
        }
        return cost(rentedForDays)
    }

    open fun vehicleType(): String {
        return "vehicle"
    }

    private fun cost(rentedForDays: Int): Double {
        return  rentPerDay * rentedForDays
    }
}