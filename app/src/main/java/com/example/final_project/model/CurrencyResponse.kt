package com.example.final_project.model

data class CurrencyResponse(
    val results: List<CurrencyResult>
)

data class CurrencyResult(
    val ticker: String,
    val name: String,
    val market: String,
    val currency_symbol: String
)
