package vehicleRentalService

class Bike(make: String, model: String, rentPerDay: Double ):Vehicle(make, model, rentPerDay) {

    override fun rent(rentedForDays: Int): Double {
        // static bike charges
        val bikeCharge = 100.5
        return super.rent(rentedForDays)+bikeCharge
    }

    override fun vehicleType(): String {
        return "bike"
    }
}