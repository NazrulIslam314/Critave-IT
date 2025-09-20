fun main() {
    print("Enter the starting number:")
    val start = readln().toInt()
    print("Enter the ending number:")
    val end = readln().toInt()
    evenOddCounter(start, end)

//  School Grade
    for (i in 1..5) {
        print("Enter Student $i marks: ")
        val marks = readln().toInt()
        val result = gradeEvalution(marks)
        println("Student $i got :$result ")
    }


//  Guess the number
    guessTheNumber()


// Find Largest and smallest
    findLargestAndSmall()


//  FizzBuzz
    fizzBuzz()
}