/**
 * Class: Class is blueprint of real entity like car
 * Object: An instance of a class is an object. It is also known as a class object.
 */
fun main() {

    var car = Car("Red", "125K");
    var car2 = Car()
    var car3 = Car(price = "1000K") // You can only pass specific arguments using parameter name


//    var person = Person()
//    person.hobby = "Skateboard"
//    person.stateHobby()

    val person2 = Person("Rohan","M",20);
    person2.showDetails()

}


/** default value using = sign in constructor
 * You can create without passing arguments(color, price)
 */
class Car(color: String = "NA", price: String = "00k") {

    // Initializer block
    init {
        println("Car created. Color is $color and Price is $price")
    }
}


/**
 * Members of class
 * - Constructors and initializer block
 * - Properties or Variable
 * - Functions or Methods
 */
class Person(name: String = "", gender: String = "") { // Primary constructor
    // Member variable - Properties
    var age = 20
    var hobby = "watch Netflix"
    var name: String
    var gender: String

    // Initializer block
    init {
        println("Init block")
        this.name = name
        this.gender = gender
    }

    // Member secondary constructor
    constructor(name: String, gender: String,age: Int)
    : this(name,gender) {
        this.age = age
        this.name = name
        this.gender = gender
    }

    //  Member functions - Methods
    fun stateHobby() {
        println("My hobby is $hobby")
    }

    //  Member functions - Methods
    fun showDetails() {
        println("Name = $name Gender = $gender Age = $age")
    }
}