fun evenOddCounter(inputA: Int, inputB: Int) {
    var odd = 0
    var even = 0

    for (i in inputA..inputB) {
        if (i % 2 == 0) {
            even++
            println("even: $i")
        } else {
            odd++
            println("Odd : $i")
        }
    }
    println("Odd Number is: $odd")
    println("Even Number is: $even")
}