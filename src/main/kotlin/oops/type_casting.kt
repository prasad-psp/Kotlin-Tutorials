package oops

import kotlin.math.floor


fun main() {
    var stringList: List<String> = listOf("Raj","Prasad","Ram","Aniket")
    var anyList: List<Any> = listOf(
        "Harry",
        20,
        55.8,
        false
    )


    for (value in anyList) {
        when (value) {
            is Int -> {
                println("Integer $value")
            }
            is Double -> {
                println("Double: $value with Floor value ${floor(value)}")
            }
            is String -> {
                println("String: $value")
            }
            else -> {
                println("Unknown type")
            }
        }
    }

    //SMART CAST
    val obj1: Any = "Hello world"
    if(obj1 !is String) {
        println("Is not a String")
    } else {
        println("Found a String of length ${obj1.length}")
    }

    // Explicit (unsafe) casting using as keyword - can go wrong
    var str1: String = obj1 as String
    println("Explicit cast : ${str1.length}")

    // TODO: comment | uncomment Below code is throw exception
//    val obj2: Any = 1234
//    var str2: String = obj2 as String
//    println(str2)

    // Explicit (safe) casting using as? keyword
    val obj3: Any = 1234
    var str3: String? = obj3 as? String
    println(str3) // Print null

}