package com.yadinjin.myfirstintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

private const val KEY = "HELLO_KEY"

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


    }
}