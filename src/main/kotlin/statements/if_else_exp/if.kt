/**
 * Use if to specify a block of code to be executed if a condition is true.
 */
fun main() {

    val a = 30
    val b = 20

    if(a > b) {
        println("$a is greater than $b")
    }

    // OR
    if(a > b) println("$a is greater than $b")


    var name = "Prasad"

    if(name == "Prasad") {
        println("Name match")
    } else {
        println("Name not match")
    }


    /**
     * If as an expression
     */
    var num1 = 10
    var num2 = 20
    var isAdd = true
    val result = if(isAdd) {
        println("Addition")
        num1 + num2
    } else {
        println("Sub")
        num1 - num2
    }

    println("Result is $result")
}