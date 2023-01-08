

fun main() {
    val marks = 70

    val result = if(marks in 0..34) {
        "Failed"
    } else if (marks in 35..59) {
        "Average marks"
    } else if (marks in 60..100) {
        "1st class marks"
    } else {
        "Does not match conditions"
    }

    print(result)

}