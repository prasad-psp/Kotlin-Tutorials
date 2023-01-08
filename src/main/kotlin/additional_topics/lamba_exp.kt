package additional_topics


/**
 * - Lambda expression is function which has no name.
 * - Lambda expression and anonymous function are 'function literals' i.e functions that are not
 *   declared, but passed immediately as an expression.
 * - Lambda is defined with curly braces {} which takes variables as parameter (if any) and a body of function.
 * - The body of function is written after a variable (if any) followed by -> operator.
 * - Syntax: { variable(s) -> body_of_lambda }
 */
fun main() {

    normalAddFun(10,20)
    println("Lambda Add Result ${lambdaAddFun(10,20)}")
    println("Shorted Lambda Add Result ${shortLambdaAddFun(10,20)}")
}

fun normalAddFun(a: Int, b: Int) {
    val result = a + b;
    println("Normal Add Result $result")
}

/**
 * Normal Lambda exp
 */
val lambdaAddFun: (Int, Int) -> Int = { a:Int, b: Int -> a + b}


/**
 * Shorter Lambda exp
 */
val shortLambdaAddFun = {a: Int, b: Int -> a + b}
