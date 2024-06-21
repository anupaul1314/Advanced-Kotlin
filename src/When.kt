import org.w3c.dom.ranges.Range

fun main() {
    val num:Int = 20
    when(num){
        in 1..10 -> println("The number is in the range of 1-10")
        in 11..20 -> println("The number is in the range of 11-20")
        in 21..30 -> println("The number is in the range of 21-30")
        in 31..40 -> println("The number is in the range of 31-40")

    }
}
