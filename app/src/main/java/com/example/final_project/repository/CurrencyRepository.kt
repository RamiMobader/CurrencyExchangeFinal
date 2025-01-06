package com.example.final_project.repository

import androidx.lifecycle.LiveData
import com.example.final_project.data.CurrencyDao
import com.example.final_project.model.Currency

class CurrencyRepository(private val currencyDao: CurrencyDao) {
    val allCurrencies: LiveData<List<Currency>> = currencyDao.getAllCurrencies()

    suspend fun insert(currency: Currency) {
        currencyDao.insert(currency)
    }
}
