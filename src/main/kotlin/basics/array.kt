/**
 * Array is collection of same type of data or different type of data. It has fixed size
 */
fun main() {

    // Same element type
    val array = arrayOf("John","Charley","Raj","Gopal")

    // Different element type
    val array2 = arrayOf("Prasad",2,'c',20.0)

    /**
     * print an array element
     */
    for(e in array) {
        var temp : String = e
        println(e)
    }

    /**
     * Change the value in an array
     */
    array[1] = "Mike"
    println("After changed value is ${array[1]}")

    spacing()

    /**
     * print 2nd array
     */
    for(e in array2) {
        println(e)
        var temp : String = e.toString()
    }

    spacing()

    /**
     * print value using array index
     */
    for (i in array.indices) {
        println("index is $i and value is ${array[i]}")
    }

    spacing()

    /**
     * Array function like for each loop, filter, sorted, reverse
     */

    array.forEach {
        println(it)
    }

    spacing()

    val tempList = array.filter { it.startsWith("r", ignoreCase = true) }
    printArray(tempList)

    spacing()

    val sortedList = array.sortedBy { it.first() }
    printArray(sortedList)

    spacing()

    array.reverse()
    printArray(array)


}

fun spacing() {
    println()
    println()
}

fun printArray(array: List<String>) {
    array.forEach {
        println(it)
    }
}

fun printArray(array: Array<String>) {
    array.forEach {
        println(it)
    }
}