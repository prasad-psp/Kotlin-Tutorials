package  oops.inheritance


fun main() {
    var main = Main()
    main.setInterface()
}



class Main(): OnItemClickListener {

    override fun onItemClicked() {
        println("Item clicked")
    }

    fun setInterface() {
        var adapter = Adapter(this)
    }

}

interface OnItemClickListener {
    fun onItemClicked()
}

class Adapter(private val listener: OnItemClickListener) {
    init {
        println("Adapter init block")
        listener.onItemClicked()
    }
}