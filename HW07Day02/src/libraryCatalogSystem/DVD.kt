package libraryCatalogSystem

class DVD(title: String, author: String, publicationYear: Int) : LibraryItem(title, author, publicationYear) {


    override fun itemType(): String {
        return "DVD"
    }


    override fun dueFeePerday(): Double {
        return super.dueFeePerday() + 5.0
    }
}