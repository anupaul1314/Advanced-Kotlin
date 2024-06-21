
    fun main() {
        val emailIdBook = mutableMapOf(
            "email1@gmail.com" to "Name 1",
            "email2@gmail.com" to "Name 2"
        )
        emailIdBook.remove("email1@gmail.com","Name 1")
        println(emailIdBook)
        println(emailIdBook.count())
        println(emailIdBook.size)
    }