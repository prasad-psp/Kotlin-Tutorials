

fun main() {

    val a = 10
    val b = 20

    /**
     * Normal if else statement
     */
    if(a > b) {
        println("$a is greater than $b")
    } else {
        println("$b is greater than $a")
    }

    // OR
    if(a > b)
        println("$a is greater than $b")
    else
        println("$b is greater than $a")

    // OR
    if(a > b) println("$a is greater than $b") else  println("$b is greater than $a")

    /**
     * if else statement is also used as expression
     * Note: else block is mandatory
     */
    val result = if(a > b) {
        "a is greater than b"
    } else {
        "b is greater than a"
    }

    println(result)
}