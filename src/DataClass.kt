
data class Book(val title:String, val author:String, val year:Int)
fun main(){

    val harryPotter = Book(
        title = "The Harry Potter",
        author = "J K",
        year = 1997
    )
   // println("${harryPotter.title},${harryPotter.author},${harryPotter.year}")
    println("${harryPotter}")
}