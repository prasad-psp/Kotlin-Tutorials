
fun main() {

    /**
     * Nested if expression means if() expression inside another if() expression
     */

    val num = -10

    if(num > 0) {
        if(num%2 == 0)
            println("Even number")
        else
            println("Odd number")
    } else {
        println("Negative number")
    }
}