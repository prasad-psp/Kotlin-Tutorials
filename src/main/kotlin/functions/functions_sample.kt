/**
 * This is kotlin main function or entry point of application
 */
fun main() {

    /**
     * Functions are also known as methods.
     * It is defined with a 'fun' keyword
     */

    withoutParam()
    withParam(10, 5)
    println(withReturn(10, 20))
}

// Function without parameters
fun withoutParam() {
    // Perform some operations in this block
    println("withoutParam")
}

// Function with parameters a & b is Functions Parameters
fun withParam(
    a: Int,
    b: Int
) {
    println(a + b)
}

// Function with Return type
fun withReturn(
    a: Int,
    b: Int
): Int {
    return a + b
}
