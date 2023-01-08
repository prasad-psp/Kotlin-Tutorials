package statements

/**
 * - Break: Kotlin labeled break statement is used to terminate the specific loop.
 * - Continue: The continue statement breaks one iteration (in the loop), if a specified condition occurs,
 *   and continues with the next iteration in the loop.
 */
fun main() {


    /**
     * Break statement
     */
//    for (i in 1 until 20) {
//        print("$i ")
//        if(i/2 == 5) {
//            break
//        }
//    }
//    println("End of the loop")

    /**
     * Continue statement
     */
    for (i in 1 until 20) {
        // 10/2 = 5
        // 11/2 = 5.5 which is 5 in terms of an int
        if(i/2 == 5) {
            continue // skip the below line of code and go to next iterator
        }
//        if(i.toFloat() / 2.0 == 5.0) {
//            continue // skip the below line of code and go to next iterator
//        }
        print("$i ")
    }
    println("End of the loop")
}