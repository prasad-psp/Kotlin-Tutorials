package oops.abstract_class

/**
 * - Abstract classes are cannot be instantiated.
 * - You cannot create object of abstract class
 * - The members of abstract class are non-abstract unless you specified keyword (abstract)
 */
fun main() {
    var audi = Audi(250.0,80.0)
    audi.run()
    audi.displayDetails()
}


// weight is non-abstract property
abstract class Car(private val weight: Double) {

    // abstract member (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract method (Must be overridden by Subclasses)
    abstract fun run()

    // Non-Abstract method
    open fun displayDetails() {
        println("Weight is $weight and maxSpeed is $maxSpeed")
    }
}

class Audi(weight: Double, override var maxSpeed: Double): Car(weight) {

    override fun run() {
        println("Run Audi and max speed is $maxSpeed")
    }

}