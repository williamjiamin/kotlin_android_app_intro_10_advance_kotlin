package com.lexueoude.kotlinadvance

//class Car(seatConstructor: Int, gearConstructor: Int, speedConstructor: Int) {
//    val seat: Int = seatConstructor
//    val gear: Int = gearConstructor
//    val speed: Int = speedConstructor
//
//    fun amazingSpeed() = speed * 100
//
//}

class Car(val speed: Int,val gear: Int,val  seat:Int){
    var distance : Int = 0
    fun amazingSpeed() = speed * 100

    constructor(time :Int ,speed: Int,gear: Int,seat: Int) : this(speed, gear, seat){
        distance = speed * time
    }

}