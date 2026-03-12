package com.example.financeapp.models

import androidx.compose.ui.graphics.vector.ImageVector

data class Transaction(
    val store: String,
    val category: String,
    val amount: Double,
    val time: String,
    val icon: ImageVector
)