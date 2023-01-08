

/**
 * When statement is like java switch case statement
 */
fun main() {

    val tap = 5

    /**
     * Using single line of code
     */
//    when(tap) {
//        1 -> print("tap 1")
//        2 -> print("tap 2")
//        3 -> print("tap 3")
//        4 -> print("tap 4")
//        5 -> print("tap 5")
//        6 -> print("tap 6")
//        else -> print("Invalid tap")
//    }

    /**
     * Using multiple lines of code
     */
    when (tap) {
        1 -> {
            println("In 1 block")
            println("tap 1")
        }
        2 -> {
            println("In 2 block")
            println("tap 2")
        }
        3 -> {
            println("In 3 block")
            println("tap 3")
        }
        4 -> {
            println("In 4 block")
            println("tap 4")
        }
        5 -> {
            println("In 5 block")
            println("tap 5")
        }
        6 -> {
            println("In 6 block")
            println("tap 6")
        }
        else -> {
            println("In else block")
            println("Invalid tap")
        }
    }

    /**
     * Sample 2 using ranges
     */

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter")
        else -> println("Invalid month")
    }


    /**
     * Sample 3 using 'is' keyword
     */
    val result: Any = arrayOf("10","20")
    when(result) {
        is Int -> println("Is Int")
        is String -> println("Is String")
        is Double -> println("Is Double")
        is Array<*> -> println("Is Array")
        else -> println("Invalid type")
    }

    /**
     * When as an expression
     */

    val num = 15
    val expressionResult = when(num) {
        in 1..10 -> "between 1 to 10"
        in 11..20 -> "between 11 to 20"
        in 21..30 -> "between 21 to 30"
        else -> "Invalid"
    }

    println("Result is $expressionResult")
}