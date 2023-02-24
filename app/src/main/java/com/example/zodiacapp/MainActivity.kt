package com.example.zodiacapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Zodiacs>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heading = arrayOf(
            "♈ Aries",
            "♉ Taurus",
            "♊ Gemini",
            "♋ Cancer",
            "♌ Leo",
            "♍ Virgo",
            "♎ Libra",
            "♏ Scorpius",
            "♐ Sagittarius",
            "♑ Capricornus",
            "♒ Aquarius",
            "♓ Pisces"
        )

        newRecyclerview = findViewById(R.id.recyclerView)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)


        newArrayList = arrayListOf<Zodiacs>()
        getUserData()
    }


    private fun getUserData() {

        for (i in heading.indices) {
            val zodiacs = Zodiacs(heading[i])
            newArrayList.add(zodiacs)
        }

        newRecyclerview.adapter = Adapter(newArrayList)
    }
}