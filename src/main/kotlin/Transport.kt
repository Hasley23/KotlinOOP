open class Transport(val name: String, val type: String, val signal: String) {
    open fun ride(){
        println("$name rides")
    }

    open fun signal(){
        println("$name's making sound $signal")
    }

    override fun toString(): String {
        return "Transport with name $name, type $type and signal $signal"
    }
}