package employeePayrollSystem

class FullTimeEmployee( name: String, employeeId: Int, monthlySalary: Double) : Employee(name, employeeId, monthlySalary) {


    override fun employeeType(): String {
        return "FullTimeEmployee"
    }


    override fun salary(workedDays: Int): Double {
        val totalSalary = calculateSalary(workedDays)
        this.monthlySalary = totalSalary
        return totalSalary
    }


    private fun calculateSalary(workingDays: Int): Double {
        val daysInMonth = 30
        return monthlySalary / daysInMonth * workingDays
    }
}