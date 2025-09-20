package employeePayrollSystem

open class Employee(var name: String, var employeeId:Int,  var monthlySalary : Double) {

    init {
        println("success, ${employeeType()} name: $name added. ")
    }

    fun setSalary(totalCalculatedSalary: Double): Double{
        this.monthlySalary = totalCalculatedSalary
        return totalCalculatedSalary
    }

    open fun salary(workedDays: Int): Double {
        return monthlySalary
    }

    open fun employeeType(): String{
        return ""
    }
}