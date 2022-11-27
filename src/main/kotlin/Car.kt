class Car(name: String, type: String, signal: String, var speedUp: Int) : Transport(name, type, signal){
    override fun ride(){
        println("Engine started")
        speedUp = 100
        super.ride()
    }

    override fun signal() {
        println(signal)
    }

    fun engineStart(){
        println("Ignite!")
    }

    fun engineStop(){
        speedUp = 0
        println("Engine stopped!")
    }
}