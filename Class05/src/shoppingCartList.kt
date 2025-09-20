fun shopinCartList() {
    val shopingList: MutableList<String> = mutableListOf()
    while (true) {
        print("Enter what you want add or remove: ")
        val input = readln()

        if (shopingList.contains(input)) {
            shopingList.remove(input)
            println("$input are deleted")
            println(shopingList)
        }else{
            shopingList.add(input)
            println(shopingList)
        }
        if (input.equals("q", ignoreCase = true)) {
            break
        }
    }
}