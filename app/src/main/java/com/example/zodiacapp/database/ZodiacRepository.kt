package com.example.zodiacapp.database

import androidx.lifecycle.LiveData

class ZodiacRepository (private val zodiacDao: ZodiacDao){

    val readAllData: LiveData<List<Zodiac>> = zodiacDao.readAllData()

}