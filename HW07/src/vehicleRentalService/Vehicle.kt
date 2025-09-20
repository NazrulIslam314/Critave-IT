package vehicleRentalService

open class Vehicle(open var make: String, open var model: String, open var rentalPerDay: Double) {

    var rentedFor: Int = 0

    open fun rent(day: Int) {
        this.rentedFor = day
        println("You rented the $make $model for $day days")
    }

    fun returnVehicle(): Double {
        val totalCost = rentalPerDay * rentedFor
        println("Returning $make $model after $rentedFor days. Total cost: $totalCost")
        rentedFor = 0
        return totalCost
    }
}