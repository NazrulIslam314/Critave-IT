package geometricShapes

class Triangle : Shape(){

    fun calculateArea(base: Double, height: Double): Double {
        val area = 0.5 * base * height
        super.calculateArea(area)
        return area
    }

    fun calculatePerimeter(side1: Double, side2: Double, side3: Double): Double {
        val perimeter = side1 + side2 + side3
        super.calculatePerimeter(perimeter)
        return perimeter
    }
}
