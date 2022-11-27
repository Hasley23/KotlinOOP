fun main(args: Array<String>) {
    // Inheritance demo
    val simpleCar = Transport("V4 zip-zap", "Passenger car", "Beep!")
    println(simpleCar.toString())
    simpleCar.ride()
    simpleCar.signal()
    println()

    val bikeTransport: Transport = Bike("Fast ghost", "Pedal bike", "Ding dong", 80)
    println(bikeTransport.toString())
    bikeTransport.ride()
    bikeTransport.signal()
    println()

    val bike = Bike("Diablo", "Two tact engine bike", "Bop-bop", 100)
    println(bike.toString())
    bike.ride()
    bike.signal()
    bike.trick()
    println()

    val fastCar = Car("V6 driver dream", "V6 passenger car", "Cool beep", 120)
    println(fastCar.toString())
    fastCar.signal()
    fastCar.engineStart()
    fastCar.ride()
    fastCar.engineStop()
}