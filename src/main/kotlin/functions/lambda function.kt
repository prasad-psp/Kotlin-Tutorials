
/**
 * Lambda function can be defined as a short way of writing a function
 * Syntax: {Variable -> Function body}
 */
fun main() {
    val cal = {num1: Int , num2: Int -> num1+num2}
    print(cal(10,20))
}