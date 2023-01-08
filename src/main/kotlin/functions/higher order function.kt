
/**
 * Higher order function in kotlin is a function that can accept the function as parameter or can also return a function
 */
fun main() {
    higherOrder(20,30,40, ::funName)
}

fun funName(num1: Int,num2: Int,num3: Int): Int {
    return ((num1 + num2 + num3) / 3)
}

fun higherOrder(num1: Int, num2: Int,num3: Int, funName: (Int,Int,Int) -> Int) {
    print(funName(num1,num2,num3))
}