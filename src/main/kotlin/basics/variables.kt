/**
 * There are two types of variable var and val
 * var is immutable or changeable
 * val is mutable or not changeable
 */
fun main() {

    // var variable
//    var name: String = "prasad"
//    name = "Rohan" // Value is reassign
//    print(name)

    // val variable
//    val name: String = "Prasad"
//    name = "Rohan" // Value cannot reassign like final Variable
//    print(name)

    /**
     * var and val without specifying the type like int, String etc..
     * in var and val automatically detect type
     */

    var name = "Prasad" // Kotlin automatically detect type of variable
    val age = 25
    var mobile = 7738490995 // explicitly add long datatype to this variable
    print("Name is $name and age is $age")
}