package collections

fun main() {

    val monthList = listOf("Jan","Feb","March")
    val anyTypeList = listOf(1,2,3,true,"Raj")
//    println(anyTypeList.size) // Get size of list
//    println(monthList[2]) // Get particular element


//    for(month in monthList) {
//        println(month)
//    }

    /**
     * Mutable list
     */
    val additionMonths = monthList.toMutableList()
    val newMonths = arrayOf("Apr","May")

    additionMonths.addAll(newMonths)
    additionMonths.add("June")

    println(additionMonths)


    /**
     * Mutable list
     */
    val mutableList = mutableListOf("Mon","Tue")
    mutableList.add("Wed")
    mutableList.removeAt(1) // Remove Tue indexing is start from 0
    println(mutableList)

    val removeList = mutableListOf("Mon","Tue")
    mutableList.removeAll(removeList)
//    mutableList.clear() // Remove all items in the list
    println(mutableList)


}

