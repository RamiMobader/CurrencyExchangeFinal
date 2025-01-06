package com.example.final_project.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.final_project.R
import com.example.final_project.model.CryptoResult

class CurrencyAdapter(private val currencies: List<CryptoResult>) :
    RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder>() {

    inner class CurrencyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tickerName)
        val symbol: TextView = itemView.findViewById(R.id.tickerSymbol)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_currency, parent, false)
        return CurrencyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        val currency = currencies[position]
        holder.name.text = currency.name
        holder.symbol.text = currency.currency_symbol
    }

    override fun getItemCount(): Int = currencies.size
}
