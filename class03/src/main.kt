fun main(){
    var num = 1
    print("Enter the number: ")
    val input = readln().toInt()
    while (num <= 10){
        val result = input * num
        println("$input x $num = $result")
        num ++
    }
//    do {
//        val result = input * num
//        println("$input x $num = $result")
//        num ++
//    }while (num <=10)
}