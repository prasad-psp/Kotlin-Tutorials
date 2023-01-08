

/**
 * - The forEach method in kotlin allows you to access element in collection or list and
 *   perform action to them.
 * - We can achieve the same thing using the for loop , but several for loops would quickly make your code unreadable
 */
fun main() {

    val arr = arrayOf("Prasad","Raj","Rohan")

    arr.forEach {
        println(it)
    }
}