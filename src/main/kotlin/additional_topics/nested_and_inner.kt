package additional_topics


/**
 * - Nested class and Inner class a class which is created inside another class and a class which is crated inside
 *   another class with keyword inner
 */
fun main() {

    // For Nested
    // Nested class must be initialized
    println(Outer.Nested().id) // accessing property
    val obj = Outer.Nested() // Object creation
    obj.showDetails()


    // For Inner
    val obj2 = OuterTwo().Inner() // Object creation
    obj2.showDetails()
}


/**
 * - Nested class is such class which is created inside another class.
 * - In Kotlin Nested class are by default static, so its data members and member function can be accessed without
 *   creating an object of the class.
 * - Nested classes cannot access the data members of outer classes.
 */
class Outer {
    private var name = "Prasad"

    class Nested {
        var id = 101

        fun showDetails() {
//            println("Name is $name") // Cannot access outer class member
            println("id $id")
        }
    }
}

/**
 * - Inner class is a class which is created inside another class with inner keyword.
 * - The advantage of inner class over nested class is that, it is able to access members of its outer class even it is private.
 */
class OuterTwo {
    private var name = "Raj"

    inner class Inner {
        var id = 101

        fun showDetails() {
            println("Name is $name and id is $id")
        }
    }
}