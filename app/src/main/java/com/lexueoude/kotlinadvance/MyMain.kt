package com.lexueoude.kotlinadvance

// keyword name(camelCase) arguments(opt) return type(opt)

// fun     funcName        (arg1: Int, arg2:String,..........): Int {
//
//           Block of code
//
//
// }

fun main() {
    val car001 = Car(2,20,400)

    println("We have created the car 001. The car has a max speed of ${car001.speed},and the car has a max gear of ${car001.gear}, And the car has a max seat of ${car001.seat}")

    println("Super speed up ,go!!!! Now the car 's speed is :${car001.amazingSpeed()}")

    val car002 = Car(10,100,10,2)
    println("The distance crossed by our car 002 is ${car002.distance}")



//    println("Welcome to lexueoude.com  My name is Williamjiamin.I am inside the main function")
//    myFirstFunc()
//    mySecondFunc()
//
//    val day = dayOfWeek()
//    println("I choose this day as my favorite day of the week: $day")
//
//    val result = our_sum(881, 100)
//    println("The result of our sum is :[$result]")


}
//
//fun myFirstFunc() {
//    println("Welcome to lexueoude.com . This is hello from myFirstFunc")
//}
//
//fun mySecondFunc() {
//
//    for (i in 1..50) {
//        println("I am counting right now-----[$i].This is counting from mySecondFunc")
//    }
//
//}
//
//fun dayOfWeek(): String {
//    val arrayOfDays = arrayOf("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
//
//    return arrayOfDays[(0..6).random()]
//
//
//}
//
//fun our_sum(num1: Int, num2: Int) = num1 + num2