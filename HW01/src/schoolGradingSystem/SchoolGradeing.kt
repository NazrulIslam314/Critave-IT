package schoolGradingSystem

fun convertToLetterGrade(marks: Int): String {
    if (marks !in 0..100) {
        throw IllegalArgumentException("Marks must be between 0 and 100")
    }

    return when (marks) {
        in 0..32 -> "F"
        in 33..39 -> "C"
        in 40..49 -> "B-"
        in 50..59 -> "B"
        in 60..69 -> "A-"
        in 70..79 -> "A"
        in 80..100 -> "A+"
        else -> throw IllegalArgumentException("Invalid marks input")
    }
}
