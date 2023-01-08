package oops.interfaces

/**
 * Interfaces are feature which allow us to extend the functionality of classes
 */

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }
}

open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable {
    open var range = 0.0

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }

    override fun drive(): String {
        return "driving the interface drive"
    }
}


class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
    : Car(maxSpeed,name, brand) {

    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String {
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("Brake inside of electric car")
    }
}

fun main() {
    val audiA3 = Car(200.0,"A3","Audi")
    val teslaCar = ElectricCar(150.0,"T1","Tesla",55.0)

    println(teslaCar.drive())
    teslaCar.brake()
    audiA3.brake()

}
