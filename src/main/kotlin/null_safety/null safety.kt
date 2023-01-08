/**
 * Kotlin type system has distinguish two types of references that can hold null (nullable references)
 * and those that can not (non-null references).
 */


var name: String = "prasad"
var surname: String? = null // define null variable type 1

var notNullRef : String? = "Prasad"

fun main() {

    surname = "Parshram" // TODO: try comment or uncomment

    println("Full name is $name $surname")
//    println("Surname length is  ${surname!!.length}") // throws kotlin null pointer exception use ? symbol



    // -----------------------------------------------------------
    // Note : Old way and New way are same. This means please read below conditions
    /** Conditions using ?
       - If variable is null its return null
       - If variable is not null then its return its function or property like surname?.length (Its return surname length int value)
     */

    // Old way
    /*if(surname != null) {
        println("Surname length is  ${surname!!.length} ")
    } else {
        null
    }*/

    // The new way of adding question mark at end of the variable
    println("Surname length is  ${surname?.length} ")
    // -----------------------------------------------------------


    // This only executes when the variable is not null
    surname?.let { println("Surname -->> $it") }



    // -------------------------------------------------------------
    // ?: Elvis operator
    val nullableRef: String? = "Prasad"
//    nullableRef = null    // TODO: comment or uncomment this line and check

    /** This means
       If #nullableRef is not null then its return its value
       If #nullableRed is null then its return default value like Raj
     */
    val result = nullableRef ?: "Raj"
    println("Elvis operator -->> $result");
    // ---------------------------------------------------------------



    // -------------------------------------------------------------------
    // !! Not null assertion
    /**
        !! It means variable is not 100% null
        This operator is risky because when the variable is null then its throws null pointer exception.
        When you 100% conform that this value is not null that scenario you can use it.
     */
    notNullRef = null // TODO: comment or uncomment this line and check
    var leng = notNullRef!!.length // This throws null pointer exception when reference is null
    println("Not null assertion -->> $leng")

    // --------------------------------------------------------------------

    /**
     * You can perform a chain safe calls:
     * val wifeAge: String = user?.wife?.age ?: 0
     */
}