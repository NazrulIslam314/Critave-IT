fun findLargestAndSmall() {
    var prevInput = 0
    var bigNumber = 0
    var smallNumber = 0
    for (i in 1..10) {
        print("Enter number $i : ")
        val input = readln().toInt()
        if (i == 1){
            prevInput = input
            bigNumber = input
            smallNumber = input
        }else{
            if (input > prevInput) {
                bigNumber = input
            } else {
                smallNumber = input
            }
        }
        prevInput = input
        if (i == 10) {
            println("BigNumber: $bigNumber")
            println("SmallNumber: $smallNumber")
        }

    }
}