package geometricShapes

open class Shape() {
    open fun calculateArea(input: Double): Double {
        println("The Area is: $input")
        return input
    }

   open fun calculatePerimeter(input: Double): Double{
       println("The Perimeter is: $input")
       return input
    }
}