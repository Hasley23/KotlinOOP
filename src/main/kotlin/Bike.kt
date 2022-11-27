class Bike(name: String, type: String, signal: String, var riderStamina: Int) : Transport(name, type, signal) {
    override fun ride() {
        println("Pedals are spinning")
        super.ride()
    }

    override fun signal() {
        println(signal)
    }

    fun trick(){
        riderStamina-=10
        println("Cool trick! But Rider stamina now is $riderStamina")
    }
}