fun main() {
    val travelItems = mutableListOf("clothes","Toothpaste","comb")
    val acess = travelItems[0]
    println(acess)
    travelItems.add(2,"Medicine")
    println(travelItems[2])


    val groceryList = mutableListOf(
        GroceryItems(3, "apples"),
        GroceryItems(4,"Mango"),
        GroceryItems(4,"Grapes")
    )
    for(items in groceryList){
        println("There are:${items.quantity} number of ${items.itemname} in our grocery list")
    }
}
data class GroceryItems(var quantity:Int, var itemname:String){}

