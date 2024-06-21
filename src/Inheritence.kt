fun main() {
    val nexon = Car("Nexon")
    nexon.specificationFeatues()
    nexon.commonFeatues()

    val ktm = Bike("KTM")
    ktm.specificationFeatues()
    ktm.commonFeatues()
}
open class Vehicle(open val name : String){
    open fun commonFeatues(){
        println("I am travelling in a $name")
    }
}

class Car(name: String) :Vehicle(name){
    fun specificationFeatues(){
        println("$name has 4 wheels")
    }
}

class Bike(name: String) :Vehicle(name){
    fun specificationFeatues(){
        println("$name has 2 wheels")
    }
}