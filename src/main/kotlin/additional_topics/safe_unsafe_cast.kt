package additional_topics


/**
 * - Unsafe cast operator: as
 * - Safe cast operator: as?
 */
fun main() {
    unsafeCast()
    safeCast()
}

/**
 * Unsafe cast ?
 * Sometimes is not possible to cast a variable and it throws an exception, this is called Unsafe cast
 */
fun unsafeCast() {
    // TODO: comment | uncomment below code throws an exception
    // Throws an exception
//    val obj: Any? = null
//    val str: String = obj as String
//    println(str)


    // ClassCastException
    // Trying to cast an integer value of Any type into String type leads to a ClassCastException
    // TODO: comment | uncomment below code throws an exception
//    val obj: Any = 123
//    val str: String = obj as String
//    println(str)
}


/**
 * Safe cast operator ?: provides a safe operation to safely cast to type.
 * It return null if casting is not possible rather than throwing an ClassCastException
 */
fun safeCast() {
    val name: Any = "Prasad"
    val safeString: String? = name as? String
    val safeInt: Int? = name as? Int
    println(safeString)
    println(safeInt)
}