package com.lexueoude.kotlinadvance.nestedclass

class Outer {

    var a : Int = 888
    inner class Nested{
        fun nestedFunction(){
//            val a : Int =999
            println("Hello from The outer class's nested class 's nested function ." +
                    "I want to read data from outer class's var a :$a")

        }

    }

}