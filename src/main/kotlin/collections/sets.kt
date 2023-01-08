package collections


/**
 * - Eliminates duplicates data
 * - UnOrder data
 */
fun main() {

    val fruits = setOf("Apple","Orange","Mango","Apple","Grape","Orange")
    println(fruits.size) // O/P - 4 because its ignore duplicate entry like Apple, Orange
    println(fruits)
    println(fruits.toSortedSet()) // Sorted alphabetically

    /**
     * Mutable set
     */
//    val newFruits = fruits.toMutableSet(); // Comment below line /Uncomment this line and check duplicate item added or not
    val newFruits = fruits.toMutableList();
    newFruits.add("Water melon")
    newFruits.add("Pear")
    newFruits.add("Apple")
    println(newFruits)

}