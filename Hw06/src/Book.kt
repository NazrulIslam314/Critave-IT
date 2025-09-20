class Book(private val title: String, private val author: String) {
    init {
        println("$title creates a new bookClass")
        println("$author creates a new bookClass")
    }

    constructor(title: String, author: String, publicationYear: Int) : this(title, author) {
        println("Secondary constructor called for $title")
        println("Published in $publicationYear")
    }
}
