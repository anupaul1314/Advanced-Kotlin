fun main() {

    val audi = CarsWithSunroof("Audi A8")
    audi.commonFeatues1()
}
open class Vehicle1(open val name : String){
    open fun commonFeatues1(){
        println("I am travelling in a $name")
    }
}

class CarsWithSunroof(name: String): Vehicle1(name){
    fun specificationFeatues1(){
        println("$name has 4 wheels")
    }
    override fun commonFeatues1(){
        super.commonFeatues1()
            println("I am operating the sunroof in a $name")
    }
}


