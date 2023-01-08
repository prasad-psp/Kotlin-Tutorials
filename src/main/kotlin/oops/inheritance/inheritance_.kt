package oops.inheritance

/**
 * The class that inherits the feature from another class is called
 * subclass or child class or derived class and the class whose features
 * are inherited is called super class or parent class or base class
**/


/**
 - Vehicle is Parent class or Super class or Base class
   use open keyword to create parent class
 - Vehicle is Parent class of Car class
**/
open class Vehicle {
    // Properties
    // Methods
}

/**
 * Car is Child class or Sub class or Derived class
 * Car is Parent class of ElectricCar class
 */
open class Car(val name: String, val brand: String): Vehicle() {
    open var range = 0.0

    fun extendRange(amount: Double) {
        if(amount > 0)
            range += amount
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}


class ElectricCar(name: String, brand: String, batteryLife: Double)
    : Car(name, brand) {

    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    fun drive() {
        println("Drove for $range KM on electricity")
    }
}

fun main() {
    val audiA3 = Car("A3","Audi")
    val teslaCar = ElectricCar("T1","Tesla",55.0)

    audiA3.drive(150.0)
    teslaCar.drive(220.0)
    teslaCar.drive()

    println(audiA3.range)
    println(teslaCar.range)

}
