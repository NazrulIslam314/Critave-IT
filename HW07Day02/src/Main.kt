import employeePayrollSystem.ContractEmployee
import employeePayrollSystem.Employee
import employeePayrollSystem.FullTimeEmployee
import geometricShapes.Circle
import geometricShapes.Rectangle
import geometricShapes.Triangle
import libraryCatalogSystem.Book
import libraryCatalogSystem.DVD
import libraryCatalogSystem.LibraryItem
import shoppingCart.CartItem
import shoppingCart.DigitalProduct
import shoppingCart.PhysicalProduct
import vehicleRentalService.Bike
import vehicleRentalService.Car
import vehicleRentalService.Vehicle
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

// Scenario 1: Online Shopping Cart
    val p1 = PhysicalProduct("Clock",  1,  1000.0)
    val p2 = PhysicalProduct("Mobile", 5, 8000.0)
    val p3=  PhysicalProduct("Laptop", 1, 90000.0)

    val d1 = DigitalProduct("Netflix", 1, 52.0)
    val d2 = DigitalProduct("Facebook", 1, 250.0)
    val d3 = DigitalProduct("Youtube", 1, 520.0)

    val cartList: List<CartItem> = listOf(p1, p2, p3, d1, d2, d3)

//    Show the cart
    cartList.forEach { println("- ${it.quantity} ${it.productName} each price is ${it.price} ") }

//    show the total cart price
    var totalCartPrice: Double = 0.0
    cartList.forEach { totalCartPrice += it.price }
    println("\n Total cart cost $totalCartPrice")

//
//    Scenario 2: Vehicle Rental Service
    val car1= Car("Toyota", "Corolla", 500.0)
    val car2= Car("Lamborghini", "Corolla", 10000.0)
    val car3= Car("BMW", "Corolla", 5000.0)

    val bike1 = Bike("Yamaha", "R15", 1500.0)
    val bike2 = Bike("Honda", "CBR-150", 500.0)
    val bike3 = Bike(make = "TVS", model = "Apache", rentPerDay = 100.0)

    val vehicleList: List<Vehicle> = listOf(car1, car2, car3, bike1, bike2, bike3)

//    book the Ride and show the cost of the ride
    vehicleList.forEach {
        val totalCost = it.rent(Random.nextInt(1 .. 40))
        println("total rented cost for the ride is: $totalCost")
    }

//    Scenario 3: Employee Payroll System

    val fullTime1 = FullTimeEmployee("Nazrul", 1, 5000.0)
    val fullTime2 = FullTimeEmployee("Akash", 2, 5500.0)
    val fullTime3 = FullTimeEmployee("Romel", 3, 6000.0)

    val contact1 = ContractEmployee("Awal", 4, 500.0)
    val contact2 = ContractEmployee("Polok", 5, 600.0)
    val contact3 = ContractEmployee("Abid", 6, 450.0)

    // Store all employees
    val allEmployees: List<Employee> = listOf(fullTime1, fullTime2, fullTime3, contact1, contact2, contact3)

    // Calculate salary
    allEmployees.forEach {
        val workedDays = Random.nextInt(range = 1..30)
       it.salary(workedDays)
        println("${it.employeeType()}: ${it.name} worked $workedDays days, salary: ${it.monthlySalary}")
    }

    println(".".repeat(50))

    // Calculate and display total payroll
    val totalPayroll = allEmployees.sumOf { it.monthlySalary }
    println("Total Company Payroll: $totalPayroll")

//    Scenario 4: Geometric Shapes

    val circle1 = Circle()
    val circle2 = Circle()
    val circle3 = Circle()

    val rectangle1 = Rectangle()
    val rectangle2 = Rectangle()
    val rectangle3 = Rectangle()

    val triangle1 = Triangle()
    val triangle2 = Triangle()
    val triangle3 = Triangle()

    // store all shapes in list
    val circleList = listOf(circle1, circle2, circle3)
    val rectangleList = listOf(rectangle1, rectangle2, rectangle3)
    val triangleList = listOf(triangle1, triangle2, triangle3)


    // Calculate circle areas and perimeters
    circleList.forEach {
        val radius = Random.nextInt(range = 5..15).toDouble()
        println("Circle radius: $radius")
        it.calculateArea(radius)
        it.calculatePerimeter(radius)
    }


    // Calculate rectangle areas and perimeters
    rectangleList.forEach {
        val length = Random.nextInt(range = 10..20).toDouble()
        val width = Random.nextInt(range = 5..15).toDouble()
        println("Rectangle length: $length, width: $width")
        it.calculateArea(length, width)
        it.calculatePerimeter(length, width)
    }


    // Calculate triangle areas and perimeters
    triangleList.forEach {
        val base = Random.nextInt(range = 8..16).toDouble()
        val height = Random.nextInt(range = 6..12).toDouble()
        val side1 = Random.nextInt(range = 10..15).toDouble()
        val side2 = Random.nextInt(range = 10..15).toDouble()
        val side3 = Random.nextInt(range = 10..15).toDouble()
        println("Triangle base: $base, height: $height")
        it.calculateArea(base, height)
        println("Triangle sides: $side1, $side2, $side3")
        it.calculatePerimeter(side1, side2, side3)
    }


//    Scenario 5: Library Catalog System
    val book1 = Book("Java", "Nazrul", 1980)
    val book2 = Book("Kotlin", "Mr Naz", 2017)
    val book3 = Book("Python", "jhon Doe", 2005)

    val dvd1 = DVD("Avenger", "Marvel", 2020)
    val dvd2 = DVD("END Game", "Marvel", 2018)
    val dvd3 = DVD("Thor", "Marvel", 2015)


//      Store all in a list
    val libraryItem: List<LibraryItem> = listOf(book1, book2, book3, dvd1, dvd2, dvd3)

//  Show all libaryItem
    println(".".repeat(50))
    libraryItem.forEach { println("${it.title} author: ${it.author} are published ${it.publicationYear}") }

//    Borrow all items
    println(".".repeat(50))
    println("Borrowing all items")
    libraryItem.forEach { it.borrowItem(Random.nextInt(range = 1..30)) }

//   Return all items
    println(".".repeat(50))
    println("Returning all items")
    libraryItem.forEach { it.returnItem(Random.nextInt(range = 1..30)) }


}