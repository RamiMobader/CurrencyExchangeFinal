package com.example.final_project.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CurrencyService {
    private const val BASE_URL = "https://api.polygon.io"

    val api: CurrencyApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(CurrencyApi::class.java)
}
