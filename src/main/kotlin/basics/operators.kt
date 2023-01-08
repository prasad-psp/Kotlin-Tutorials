package basics

val a = 20
val b = 10

fun main() {

    /**
     * Arithmetic operators ( +, -, *, /, % )
     */

//    println("Calculate $a + $b = ${a+b}")
//    println("Min $a - $b = ${a-b}")
//    println("Multi $a * $b = ${a*b}")
//    println("Div $a / $b = ${(a/b).toFloat()}")
//    println("Mod $a % $b = ${a%b}")



    //-------
    /**
     * Comparison operators ( ==, !=, <, >, <=, >= )
     */

//    println("$a is equals to $b ${a == b}")
//    println("$a is not equals to $b ${a != b}")
//    println("$a is greater than $b ${a > b}")
//    println("$a is smaller than $b ${a < b}")
//    println("$a is greater than or equals to $b ${a >= b}")
//    println("$a is smaller than or equals to $b ${a <= b}")
//
//    val result = a != b && a > b
//    print(result)


    /**
     * Increment decrement operators (++, --)
     */
    var num = 20
    var num2 = 30
    println("Pre Increment ${++num}")
    println("Pre Decrement ${--num2}")

    var num3 = 15
    var num4 = 12
    println("Post Increment ${num3++}")
    println("Post Decrement ${num4--}")
    println("After Post Inc/Dec final value of num3 is $num3 and num4 is $num4")

}