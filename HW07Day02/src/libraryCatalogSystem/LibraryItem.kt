package libraryCatalogSystem

open class LibraryItem(var title: String, var author: String, var publicationYear: Int) {

    init {
        println("Success, $title ${itemType()} was created.")
    }

    private var isBorrowed: Boolean = false
    private var borrowedForDays: Int = 0
    private var overDueFine: Double = 0.0

    fun borrowItem(forDays: Int) {
        if (isBorrowed) {
            println("You can't borrow the ${itemType()} at this time - it's already borrowed")
        } else {
            borrowedForDays = forDays
            isBorrowed = true
            println("Borrowed a ${itemType()} named '$title' for $forDays days")
        }
    }

    fun returnItem(daysActuallyKept: Int) {
        if (isBorrowed) {
            if (daysActuallyKept > borrowedForDays) {
                val lateDays = (daysActuallyKept - borrowedForDays)
                overDueFine = lateDays * dueFeePerday()
                println("You returned the ${itemType()} named '$title' $lateDays days late. Your fine is $overDueFine")
            } else {
                println("You returned the ${itemType()} named '$title' on time after $daysActuallyKept days")
            }
            isBorrowed = false
        } else {
            println("You did not borrow this ${itemType()} earlier.")
        }
    }

    open fun dueFeePerday(): Double {
        return 0.0
    }

    open fun itemType(): String {
        return "item"
    }

}