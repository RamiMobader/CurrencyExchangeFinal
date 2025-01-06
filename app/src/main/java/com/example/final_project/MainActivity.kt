package com.example.final_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.final_project.adapter.CurrencyAdapter
import com.example.final_project.viewmodel.CurrencyViewModel

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: CurrencyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel = ViewModelProvider(this)[CurrencyViewModel::class.java]
        viewModel.tickers.observe(this) { tickers ->
            val adapter = CurrencyAdapter(tickers)
            recyclerView.adapter = adapter
        }

        // Call the API
        viewModel.fetchTickers("vJnIX7p9LtRDDmb2TOjLkHW4uqzb8Xn2")
    }
}
