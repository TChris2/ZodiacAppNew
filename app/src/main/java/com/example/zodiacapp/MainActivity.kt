package com.example.zodiacapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Zodiacs>
    lateinit var heading : Array<String>
    lateinit var zodiacInfo : Array<String>

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

        zodiacInfo = arrayOf(
            getString(R.string.aries),
            getString(R.string.taurus),
            getString(R.string.gemini),
            getString(R.string.cancer),
            getString(R.string.leo),
            getString(R.string.virgo),
            getString(R.string.libra),
            getString(R.string.scorpio),
            getString(R.string.sagittarius),
            getString(R.string.capricorn),
            getString(R.string.aquarius),
            getString(R.string.pisces),
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

        //new stuff
        var adapter = Adapter(newArrayList)
        newRecyclerview.adapter = adapter
        adapter.setOnItemClickListener(object:Adapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                //Toast.makeText(this@MainActivity,"You Clicked on no. $position", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, ZodiacDisplayInfo::class.java)
                intent.putExtra("zodiacInfo",zodiacInfo[position])

                startActivity(intent)
            }

        })

    }
}