package com.example.zodiacapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ZodiacDisplayInfo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zodiac_display_info)

        val b : TextView = findViewById(R.id.text)

        val bundle : Bundle? = intent.extras
        val zodiacInfo = bundle!!.getString("zodiacInfo")


        b.text = zodiacInfo




    }
}