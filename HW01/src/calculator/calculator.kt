package calculator

fun calculator(num1: Double, num2: Double, operator: String): Double {
    return when (operator) {
        "+" -> num1 + num2.toInt()
        "-" -> num1 - num2.toInt()
        "*" -> num1 * num2.toInt()
        "/" -> {
            if (num2 == 0.0) {
                throw IllegalArgumentException("Cannot divide by zero")
            }
            num1 / num2
        }
        else -> throw IllegalArgumentException("Invalid Operator")
    }
}
