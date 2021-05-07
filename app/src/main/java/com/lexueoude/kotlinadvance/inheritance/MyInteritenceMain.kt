package com.lexueoude.kotlinadvance.inheritance

fun main(){
    val car001 = Car(2)

    println("Some of the inherited common properties: doors: ${car001.doors},speed: ${car001.speed}")
    println("Some of the inherited common method: move: ${car001.move()},stop: ${car001.stop()}")

    val truck001 = Truck(888)

    println("Some of the inherited common properties: doors: ${truck001.doors},speed: ${truck001.speed}")
    println("Some of the inherited common method: move: ${truck001.move()},stop: ${truck001.stop()}")
    println("Some of the special method: ${truck001.cargoWeight()}")



}