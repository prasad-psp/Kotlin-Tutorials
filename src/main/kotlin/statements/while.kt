/**
 * The while loop loops through a block of code as long as a specified condition is true
 */
fun main() {

    // Example 1
//    var count = 1;
//
//    while (count <= 10) {
//        println("count is $count")
//        count++
//    }

    // Example 2
    val arr = arrayOf(10,20,-50,15,-24)
    var index = 0

    while (index < arr.size) {
        if(arr[index] > 0) {
            println("Positive number ${arr[index]}")
        } else {
            println("Negative number ${arr[index]}")
        }
        index++
    }
}