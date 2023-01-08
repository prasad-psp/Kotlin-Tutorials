package additional_topics.open_keyword

/**
 * In kotlin all classes are final by default, so they can't be inherited by default.
 * So to make a class inheritable to other classes you must mark it with the open keyword, else you get an error
 * "type is final so can't be inherited"
 */
fun main() {
    Derived()
}

class Derived() : Base() {
}