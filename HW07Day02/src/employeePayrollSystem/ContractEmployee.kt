package employeePayrollSystem

class ContractEmployee(name: String, employeeId: Int, var dailySalary: Double) : Employee(name, employeeId, dailySalary) {

    override fun employeeType(): String {
        return "ContractEmployee"
    }

    override fun salary(workedDays: Int): Double {
        val totalSalary = calculateSalary(workedDays)
        super.setSalary(totalSalary)
        return totalSalary
    }

    private fun calculateSalary(numOfDayContact: Int): Double {
        return dailySalary * numOfDayContact
    }
}