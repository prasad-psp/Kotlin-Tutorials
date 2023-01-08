import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Coroutines stands for co-operating function.
 * Coroutines that helps to write simplified asynchronous code that keeps the application responsive while maintaining
 * heavy task like network call.
 *
 * Added Maven Coroutines Dependency in Project structure
 * org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4
 */


fun main() = runBlocking {

    launch {
        delay(2000)
        println("Hello")
    }

    delay(3000)
    println("Prasad")

}