
/**
 * Do while is used to execute do block at list a once.
 */
fun main() {

    var count = 5
    do {
        println("Count is $count")
        count++
    } while (count < 10)


    var num = 15
    do {
        println("$num")
        num++
    }while (num <= 10) // num is 15 so this condition is not true In this scenario do code block is executed at list once
}