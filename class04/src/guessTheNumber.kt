import kotlin.random.Random

fun guessTheNumber() {
    val number = Random.nextInt(1, 50)
    println(number)
    for (i in 0..5) {
        print("Guess the number:")
        val input = readln().toInt()
        if (input == number) {
            println("Congratulation you guess the correct number")
            break
        } else {
            println("Your are wrong. ")
        }
    }
}