package com.example.final_project.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.final_project.model.Currency

@Dao
interface CurrencyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(currency: Currency)

    @Query("SELECT * FROM currency_table")
    fun getAllCurrencies(): LiveData<List<Currency>>
}
