package vehicleRentalService

class Car(override var make: String, override var model: String, override var rentalPerDay: Double = 500.0) :
    Vehicle(make, model, rentalPerDay) {
    override fun rent(day: Int) {
        super.rent(day)
        println("Car rental confirmed.")
    }
}