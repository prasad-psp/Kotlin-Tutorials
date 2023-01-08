package additional_topics

import additional_topics.open_keyword.Base

/**
 * - Visibility modifiers are keyword which are used to restrict the use of classes, interfaces, methods,
 *   and properties in kotlin.
 * - These modifiers are used to at multiple places such as class header or method body.
 * - Visibility modifiers are categorized into four different types:
 *   1. public
 *   2. private
 *   3. protected
 *   4. internal
 */
fun main() {

    // For public
    Sample().show()

    // For private
    /**
     * Show compile time error. display can access within the class because its private
     */
//    Sample().display()

    // For Internal
    InternalSample().show()

    // For Protected
    Derived().showBaseValue()
    /**
     * Show compile time error. Because variable a is protected
     */
//    Base().a
}

/**
 * Public modified element is accessible from everywhere in the project. It is default modifier in Kotlin.
 */

/**
 * Private modified element is allows us to be accessible only within the block in which properties, fields,
 * etc. are declared.
 */
public class Sample {

    /**
     * By default Kotlin declared public
     */
    public fun show() {
        println("Show()")

        /**
         * display can access within the class because its private
         */
        display()
    }

    private fun display() {
        println("Display()")
    }
}



/**
 * Internal modifier is feature in Kotlin, which is not available in java.
 * The internal modifier makes the field visible only inside the module in which it is implemented
 */
internal class InternalSample {
    internal val a = 10

    internal fun show() {
        println("Show $a")
    }
}

/**
 * Protected modifier with a class or an interface allows visibility to its class or subclass only.
 */
class Derived: Base() {

    // Override protected variable
    override var a = 20

    fun showBaseValue() {
        println("Base value is $a")
    }
}



