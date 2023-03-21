package com.example.zodiacapp.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class ZodiacViewModel(application: Application): AndroidViewModel(application) {

    private val readAllData: LiveData<List<Zodiac>>
    private val repository: ZodiacRepository

    init {
        val zodiacDao = ZodiacDatabase.getDatabase(application).ZodiacDao()
        repository = ZodiacRepository(zodiacDao)
        readAllData = repository.readAllData
    }
}