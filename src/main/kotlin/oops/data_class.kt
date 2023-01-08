package oops


/**
 * We often create classes to hold some data in it. In such classes, some standard functions
 * are often derivable from the data. In Kotlin, this type of class is known as data class
 * and is marked as data.
 */
fun main() {

    val user1 = User(
        1,
        "prasad"
    )

    user1.name = "Harry"
    println(user1.name)


    val user2 = User(
        id = 2,  // TODO: change id 2 to 1 and see comparison print statement (line no-25)
        name = "Harry"
    )

    println(user1 == user2)

    println("User details $user1")

    // You can copy user value in another instance
    var updatedUser = user1.copy(name = "Rakesh")
    println("After copy user1 is $user1 and updateUser is $updatedUser")

    val (id,name) = updatedUser
    println("Id is $id Name is $name from updated user")
}

/**
 * Data class is like model class
 * Data class have primary constructor with at least one parameter
 */
data class User(
    val id: Long,
    var name: String
)