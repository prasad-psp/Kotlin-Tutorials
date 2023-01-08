package additional_topics

import java.lang.Exception

/**
 * - Exception Handling:
 *   - Handling runtime problems which occurs in the program and would otherwise lead to
 *     program termination.
 *   - Is a technique which handle runtime problems and maintain the flow of program execution.
 *
 * - Exception: An Exception is runtimes problem which occurs in the program and would otherwise lead to
 * program termination.
 *
 * - There are four keywords to used an exception handling
 *   1. try
 *   2. catch
 *   3. finally
 *   4. throw
 */
fun main() {

    val arr = arrayListOf<Int>(10,50,60)
    val index: Int = 5

    customThrowException(10) // TODO: Pass the signed number for example(-10) and check its throws an exception

    try {
        arr[index]
        println("Data found")
    } catch (e: Exception) {
        println("Exception occurred ${e.message}")
    }
    finally {
        println("Clear Array in finally block")
        arr.clear()
    }

    println("End -->> Array size is ${arr.size}")

}


fun customThrowException(index: Int) {
    if(index < 0) {
       throw Exception("Please pass valid number")
    }
}