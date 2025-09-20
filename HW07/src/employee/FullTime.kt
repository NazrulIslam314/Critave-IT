package employee

class FullTime : Employee() {

    override fun add(name: String, salary: Double) {
        super.add(name, salary)

        println("$name are added to the Full Time employee list id: ${employeeList[name]?.first}")
    }

    override fun salary(name: String, workingDay: Int): Double?{

        val salary = super.salary(name, workingDay)
        println("- $name salary was $salary")
        return salary
    }
}