package collections

/**
 * Array list are used to create dynamic array. Which means the size of an ArrayList can be increased or decreased
 * according to your requirements.
 *
 * - Its provides read write functionality
 * - Its follow the sequence of insertion order
 * - Its non synchronized and it may contain duplicate elements
 *
 */
fun main() {

    val arrList = arrayListOf<String>()

    /**
     * Add
     */
    arrList.add("one")
    arrList.add("two")
    arrList.add("three")


    println(arrList)

    /**
     * Remove
     */
    arrList.remove("two") // or can remove element using index
    println(arrList)

    /**
     * Add list
     */
    val tempList = listOf("four","five")
    arrList.addAll(tempList)
    println(arrList)

    /**
     * get specific element
     */
    println(arrList[2])

    /**
     * clear array list
     */
    arrList.clear()
    println(arrList)
}