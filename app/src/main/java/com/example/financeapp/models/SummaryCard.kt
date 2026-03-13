package com.example.financeapp.models

import androidx.compose.ui.graphics.Color
import com.example.financeapp.ui.theme.color1
import com.example.financeapp.ui.theme.color2
import com.example.financeapp.ui.theme.color3


data class SummaryCard(
    val title: String,
    val amount: Double,
    val color: Color
)

val cards = listOf(
    SummaryCard("Actividad", 1220.0, color3),
    SummaryCard("Ventas", 280.99, color1),
    SummaryCard("Ganancias", 280.99, color2)
)
