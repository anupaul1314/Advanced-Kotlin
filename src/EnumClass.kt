import org.w3c.dom.css.RGBColor

fun main() {
    val new = Fruits.Apple1
    println(new)
    println(new.color)
}
//enum class Fruit{
//    APPLE,
//    BANANA,
//    ORANGE,
//    GRAPES,
//    BLUEBERRY,
//    POMEGRANATE,
//    KIWI,
//    BLACKBERRY,
//    MANGO,
//    RASBERRY,
//    WATERMELON,
//    MUSKMELON
//}
enum class Fruits(var weight:Int,var color: String,var price:Int){
    Apple(2, "Red",20 ),
    Apple1(2, "Black",40 ),
    Apple2(2, "Blue",60 )

}
