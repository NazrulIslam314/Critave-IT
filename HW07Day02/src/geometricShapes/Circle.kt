package geometricShapes

import kotlin.math.PI

class Circle : Shape(){

    override fun calculateArea(radius: Double): Double {
        val area = PI * radius * radius
        super.calculateArea(area)
        return area
    }

    override fun calculatePerimeter(radius: Double): Double {
        val perimeter = 2 * PI * radius
        super.calculatePerimeter(perimeter)
        return perimeter
    }
}
