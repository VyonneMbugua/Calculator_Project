package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var buttonCalculator:Button ?=null
    var buttonIntent:Button ?=null
    var buttonWeb:Button ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculator=findViewById(R.id.Calculator)
        buttonIntent=findViewById(R.id.intent)
        buttonWeb=findViewById(R.id.web)

        buttonCalculator!!.setOnClickListener{
            val intent=Intent(this,)
        }



    }
}