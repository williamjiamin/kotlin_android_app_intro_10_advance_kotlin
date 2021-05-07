package com.lexueoude.kotlinadvance.inheritance

open class Vehicle (
    val speed : Int = 50,
    val wheels :Int = 4,
    val doors: Int = 4,
    val driverName: String = "lexueoude.com"
){
    fun move() = speed *100
    fun stop() = 0
    fun amazingSpeed() = speed *500

}