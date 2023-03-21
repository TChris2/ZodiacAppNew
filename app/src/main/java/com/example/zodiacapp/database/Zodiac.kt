package com.example.zodiacapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "zodiac_table")
data class Zodiac (
    @PrimaryKey(autoGenerate = true)
    val name: String,
    val description: String,
    val symbol: String,
    val month: String)

