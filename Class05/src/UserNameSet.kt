fun userNameSet(){

    val userName: MutableSet<String> = mutableSetOf()
    while (true) {
        print("Enter the username: ")
        val input = readln()
        if (userName.contains(input)) {
            println("Username is taken. Choose another")
            println(userName)
        } else {
            userName.add(input)
            println(userName)
        }

        if (input.equals("q", ignoreCase = true)) {
            break
        }
    }
}

