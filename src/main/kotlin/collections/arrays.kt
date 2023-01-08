package collections


fun main() {

//    val numbers: IntArray = intArrayOf(10,20,50,60)

//    val numbers = intArrayOf(10,20,50,60)

    val numbers = arrayOf(10,20,50,60)

    val doubleArr = doubleArrayOf(10.0,5.4,15.0)
    val longArr = longArrayOf(5165,213212,56446,656464)

    // Store different types of elements
    val anyArr = arrayOf("Prasad",10,55.20,4646484)


//    print(numbers.contentToString())

    // print all elements in array
//    for(value in numbers) {
//        println(value)
//    }

    /**
     * Get specific value of index from array
     */
    println(numbers[2])


    /**
     * Change value of specific index in array
     */
    println("Before change ${numbers.contentToString()}")
    numbers[2] = 55 // OR numbers.set(2,55)
    println("After change ${numbers.contentToString()}")

    /**
     * Reverse array and copy array in different object
     */
    val reversArray = numbers.reversedArray().copyOf()
    println("Revers array ${reversArray.contentToString()}")

    /**
     * Out of bound exception
     */
    // println(reversArray[10]) // throw runtime exception


    /**
     * String array
     */
    val days = arrayOf("Sun","Mon","Tue","Wed","Thu","Fri","Sat")
    println("Days ${days.contentToString()}")

    /**
     * Object or Model class array
     */
    val objArr = arrayOf(Fruit(1,"Apple"), Fruit(2,"Banana"))
    println("Fruits ${objArr.contentToString()}")

    /// Display only fruit names
    objArr.forEach {
        println("Fruit name ${it.name}")
    }
}


data class Fruit(
    val id: Int,
    val name: String
)

