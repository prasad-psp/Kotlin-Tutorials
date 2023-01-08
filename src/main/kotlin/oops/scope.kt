/**
 * Global scope : A global variable is a variable that is declared at the top of the program and outside all functions.
 * Local scope: A local variable can only be used in the particular block where it is declared.
 */

var globalScope = "Prasad Parshram" //Global scope

fun main() {
    show("Raj")
    println("Global scope $globalScope")
}



fun show(name: String) {
//    name = "PSP" // You cannot assign value to #name because its #val or parameter
    var name = name
    name = "PSP" // local Scope
    println("Show name = $name")
}