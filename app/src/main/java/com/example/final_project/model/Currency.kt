package com.example.final_project.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "currency_table")
data class Currency(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val baseCurrency: String,
    val targetCurrency: String,
    val conversionRate: Double
)
