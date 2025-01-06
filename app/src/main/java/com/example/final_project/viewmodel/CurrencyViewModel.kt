package com.example.final_project.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.final_project.model.CryptoResult
import com.example.final_project.network.CurrencyService
import kotlinx.coroutines.launch

class CurrencyViewModel : ViewModel() {
    private val _tickers = MutableLiveData<List<CryptoResult>>()
    val tickers: LiveData<List<CryptoResult>> = _tickers

    fun fetchTickers(apiKey: String) {
        viewModelScope.launch {
            try {
                val response = CurrencyService.api.getTickers(apiKey = apiKey)
                if (response.isSuccessful) {
                    _tickers.postValue(response.body()?.results)
                } else {
                    Log.e("CurrencyViewModel", "API Error: ${response.message()}")
                }
            } catch (e: Exception) {
                Log.e("CurrencyViewModel", "Network Error: ${e.message}")
            }
        }
    }
}
