fun main() {
    val pen = Pen()
    pen.fillInk()
}
class Pen : Ink{
    override fun fillInk() {
        println("Pen is filled with Ink")
    }
}
interface Ink{
    fun fillInk()
}