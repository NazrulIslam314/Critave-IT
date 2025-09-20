fun studentGrade() {
    val studentGrades = mutableMapOf<String, Int>()


    studentGrades["Alice"] = 90
    studentGrades["Bob"] = 85
    studentGrades["Charlie"] = 78

    val studentName = "Bob"
    if (studentGrades.containsKey(studentName)) {
        val currentGrade = studentGrades[studentName]
        println("$studentName's current grade is $currentGrade")

        studentGrades[studentName] = 88
        println("$studentName's grade has been updated to ${studentGrades[studentName]}")
    } else {
        println("$studentName not found in the system.")
    }

    val removedStudent = "Charlie"
    studentGrades.remove(removedStudent)
    println("$removedStudent has been removed from the system.")

    println("Updated Student Grades: $studentGrades")
}
