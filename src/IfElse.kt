
fun main() {
    val currentWheatherCondition:WheatherCondition = WheatherCondition.Rainy
    if (currentWheatherCondition==WheatherCondition.Rainy){
        println("Umbrella ")
    }
    else{
        println("No Umbrella")
    }
}
enum class WheatherCondition{
    Rainy,
    Sunny
}
