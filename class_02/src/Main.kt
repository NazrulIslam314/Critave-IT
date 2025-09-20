fun main(){
    print("Enter the number: ")
    val number = readln().toInt()
    for (i in 1 .. 10){
        val result = number*i
        println("$number x $i = $result")
    }

}