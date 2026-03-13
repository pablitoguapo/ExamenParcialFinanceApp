package com.example.financeapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.models.SummaryCard
import com.example.financeapp.models.cards


@Composable
fun SummaryCards(cards: List<SummaryCard>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Card(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = cards[0].color)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Actividad",
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .size(35.dp)
                )

                Text(
                    text = cards[0].title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = "de la Semana",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Text(
                    text = "$${cards[0].amount}",
                    fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    fontSize = 12.sp
                )
            }
        }


        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Card(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = cards[1].color)
            ) {
                Column(
                    modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement =  Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(
                        text =  cards[1].title,
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "$${cards[1].amount}",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
            }

            Card(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = cards[2].color)
            ) {
                Column(
                    modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement =  Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(
                        text = cards[2].title,
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "$${cards[2].amount}",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSummaryCards() {
    SummaryCards(cards)
}
