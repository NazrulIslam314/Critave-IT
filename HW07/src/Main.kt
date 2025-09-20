import employee.FullTime
import employee.PartTime
import shopping.DigitalProducts
import shopping.PhysicalProducts
import vehicleRentalService.Bike
import vehicleRentalService.Car

fun main() {
    // Online shopping cart
    val digitalCart = DigitalProducts()
    val physicalCart = PhysicalProducts()

    digitalCart.add("Netflix Subscription", 1, 100.0)
    digitalCart.add("Spotify Premium", 1, 200.0)
    digitalCart.add("Netflix Subscription", 2, 100.0)

    physicalCart.add("Clock", 2, 500.0)
    physicalCart.add("Laptop Bag", 1, 450.0)
    physicalCart.add("Laptop", 1, 899.0)

    physicalCart.shippingCost = 250.00

    digitalCart.showCart()

    physicalCart.showCart()

    val digitalTotal = digitalCart.totalCost()
    val physicalTotal = physicalCart.totalCost()
    val grandTotal = digitalTotal + physicalTotal

    println("Digital products total: $digitalTotal")
    println("Physical products total: $physicalTotal")
    println("GRAND TOTAL: $grandTotal")

    // vehicle Rental
    val bike = Bike("Honda", "CBR-150")
    bike.rent(1)
    val car = Car("Toyota", "Wagan", 5200.0)
    car.rent(2)
    bike.returnVehicle()
    car.returnVehicle()


    // Employee salary management
    val f1 = FullTime()
    val p1 = PartTime()


    f1.add("Sojib", 3000.0)
    f1.add("Sakib", 100.0)

    p1.add("Nazrul", 450.0)
    p1.add("Awal", 50.0)

    println("............Full time Job Holder Salary............")
    f1.salary("Sojib", 30)
    f1.salary("Sakib", 30)

    println("............Part time Job Holder Salary............")
    p1.salary("Nazrul", 5)
    p1.salary("Awal", 5)



    println("Show all Employee salary")
    println("Id. Name salary")
    f1.salary()
    p1.salary()
}