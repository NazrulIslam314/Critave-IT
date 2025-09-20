package employee


open class Employee() {

    val employeeList: MutableMap<String, Pair<Int, Double>> = mutableMapOf()


    open fun add(name: String, salary: Double) {

        val idNumber = generateId()

        employeeList[name] = Pair(idNumber, salary)
    }


    fun salary() {

        employeeList.forEach { (name, value) ->
            val (id, salary) = value
            println("- $id. $name $salary")
        }
    }


    open fun salary(name: String, workingDay: Int): Double? {

        val month = 30
        if (workingDay > month) {
            println("Enter work in month between 0 to 30 ")
        }

        val fullSalary = employeeList[name]?.second
        return fullSalary?.div(month)?.times(workingDay)
    }


    private fun generateId(): Int {
        var idNumber = 1
        employeeList.forEach { name, value ->
            val (id, salary) = value
            if (idNumber == id) {
                idNumber += 1
            }
        }
        return idNumber
    }
}
