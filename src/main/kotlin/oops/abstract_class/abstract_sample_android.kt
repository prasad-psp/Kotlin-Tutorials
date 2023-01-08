package oops.abstract_class

fun main() {
    var activity = LoginActivity()
}

abstract class BaseActivity {
    var layoutId : String? = null

    init {
        println("Layout id: ${getLayout()}")
    }

    abstract fun getLayout() : String
}

class LoginActivity(): BaseActivity() {

    override fun getLayout(): String {
        return "login_layout_id"
    }

}