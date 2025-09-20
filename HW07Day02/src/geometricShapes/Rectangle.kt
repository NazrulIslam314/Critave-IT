package geometricShapes

class Rectangle : Shape(){

    fun calculateArea(length: Double, width: Double): Double {
        val area = length * width
        super.calculateArea(area)
        return area
    }

    fun calculatePerimeter(length: Double, width: Double): Double {
        val perimeter = 2 * (length + width)
        super.calculatePerimeter(perimeter)
        return perimeter
    }
}
