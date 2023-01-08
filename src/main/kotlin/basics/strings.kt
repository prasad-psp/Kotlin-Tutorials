
/**
 * - Declare string type using double quotes
 * - String is collection of character
 */
fun main() {

    val name = "PraSad"

    // We can directly access this variable using the $ symbol
    println("Name is $name")

    // Getting the first character in the string
    println("First char is ${name.first()} or ${name[0]}")

    // Getting the last character in a string
    println("Last char is ${name.last()} or ${name[name.length - 1]}")

    // access string functions like uppercase , lowercase etc. using ${}
    println("Uppercase name is ${name.uppercase()} and Lowercase name is ${name.lowercase()}")
}