package vehicleRentalService

class Car(make: String, model: String, rentPerDay: Double ):Vehicle(make, model, rentPerDay) {

    override fun rent(rentedForDays: Int): Double {
        // static car charges
        val carCharge = 200.5
        return super.rent(rentedForDays)+carCharge
    }

    override fun vehicleType(): String {
        return "car"
    }
}