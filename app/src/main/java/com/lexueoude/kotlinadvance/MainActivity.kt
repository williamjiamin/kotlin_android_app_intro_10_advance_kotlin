package com.lexueoude.kotlinadvance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            888/0
            777/0
            666/0
        }catch (exception: Exception){
            exception.printStackTrace()
        }

    }
}



// keyword name(camelCase) arguments(opt) return type(opt)

// fun     funcName        (arg1: Int, arg2:String,..........): Int {
//
//           Block of code
//
//
// }