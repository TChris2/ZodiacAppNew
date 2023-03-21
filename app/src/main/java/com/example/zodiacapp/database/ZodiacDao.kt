package com.example.zodiacapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface ZodiacDao {
    @Query("SELECT * FROM zodiac_table")
    fun showInfo(): LiveData<List<ZodiacDatabase>>
    abstract fun readAllData(): LiveData<List<Zodiac>>

}