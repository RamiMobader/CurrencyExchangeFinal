package com.example.final_project.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/v3/reference/tickers")
    suspend fun getTickers(
        @Query("asset_class") assetClass: String = "crypto",
        @Query("apiKey") apiKey: String
    ): Response<CryptoResponse>
}
