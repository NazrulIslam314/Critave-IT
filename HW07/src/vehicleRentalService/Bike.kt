package vehicleRentalService

class Bike(override var make: String, override var model: String, override var rentalPerDay: Double = 250.0) :
    Vehicle(make, model, rentalPerDay) {
    override fun rent(day: Int) {
        super.rent(day)
        println("Bike rental confirmed.")
    }
}