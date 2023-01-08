
fun main() {
    val animal = Animal();
    animal.sound // TODO: point 1: throws an error if the variable sound is not initialized
}

class Animal() {

    /**
     *  You cannot create nullable variable.
     *  If you want to create non-nullable variable without initializing Use 'lateinit' keyword
     *  lateinit means this variable is initialized it later on.
     *  lateinit handle very carefully if variable is not initialized or you access this variable then is throw null pointer exception
     */
//    var sound: String // compiler error
    lateinit var sound: String

    init {
        // TODO: comment and uncomment below the line and check point no 1
        sound = "ASDSf"
    }
}