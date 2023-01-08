package collections

/**
 * - Maps store data as a key value paired.
 * - Maps keys are unique that hold one value per key
 */
fun main() {

//    val daysOfWeek = mapOf(1 to "Mon", 2 to "Tue", 3 to "Wed",1 to "Thus")
//    println(daysOfWeek) // In Output ignore last value 1 to "Thus" because its key is already used.

    val daysOfWeek = mapOf(1 to "Mon", 2 to "Tue", 3 to "Wed")
    println(daysOfWeek[2]) // Get particular value : Pass key
    println()

    for(key in daysOfWeek.keys) {
        println("$key is to ${daysOfWeek[key]}")
    }

    /**
     * Store object in map
     */
    val fruitsMaps = mapOf("Fav" to Fruits("Mango",20.0), "Ok" to Fruits("Orange",10.5))
    println(fruitsMaps)

    /**
     * Mutable map
     */
    val newDaysOfWeek = daysOfWeek.toMutableMap()
    newDaysOfWeek[5] = "Fri"
    newDaysOfWeek[4] = "Thus"
    println(newDaysOfWeek)
    println(newDaysOfWeek.toSortedMap())
}

data class Fruits(val name: String, val price: Double)