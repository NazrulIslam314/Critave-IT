package libraryCatalogSystem

class Book(title: String, author: String, publicationYear:Int ) : LibraryItem(title, author, publicationYear){


    override fun itemType(): String{
        return "Book"
    }


    override fun dueFeePerday(): Double {
        return super.dueFeePerday() + 2.0
    }
}

