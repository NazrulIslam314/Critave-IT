import calculator.calculator
import schoolGradingSystem.convertToLetterGrade
import watherSuggetion.suggestWhatToWear

fun main() {

    // A basic Calculator
    try {
        println("Enter the 1st Number: ")
        val num1 = readln().toDouble()

        println("Enter the 2nd Number: ")
        val num2 = readln().toDouble()

        println("Enter the Operator (+, -, *, /): ")
        val operator = readln().trim()

        val result = calculator(num1, num2, operator)
        println("Result: $result")

    } catch (e: Exception) {
        println("Error: Invalid input for calculator. ${e.message}")
        return
    }

    // Marks to school grading
    try {
        println("Enter the student's marks: ")
        val marks = readln().toInt()

        val grade = convertToLetterGrade(marks)
        println("Grade: $grade")

    } catch (e: Exception) {
        println("Error: Invalid input for marks. ${e.message}")
        return
    }

    // Weather suggestion
    try {
        println("Enter the current temperature in Celsius: ")
        val temperature = readln().toDouble()

        val suggestion = suggestWhatToWear(temperature)
        println(suggestion)

    } catch (e: Exception) {
        println("Error: Invalid input for temperature. ${e.message}")
    }
}

