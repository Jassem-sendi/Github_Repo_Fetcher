package com.example.githubfetchdata.ui.helloPage

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun Hello(
    viewModel: HelloViewModel = HelloViewModel() ,
    @SuppressLint("ModifierParameter") modifier: Modifier= Modifier
) {
    var username by remember { mutableStateOf("") }
    val ui by viewModel.uiState.collectAsState()
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        AsyncImage(
            model = "https://logosmarcas.net/wp-content/uploads/2020/12/GitHub-Logo.png",
            contentDescription =null
        )
        Spacer(modifier=Modifier.height(20.dp))
        Text(
            text = "Please Enter the GitHub Username",
            style = TextStyle(
                color = Color.Gray,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            ) ,
            modifier=Modifier
                .fillMaxWidth()
        )
        Spacer(modifier=Modifier.height(20.dp))
        TextField(
            value = username,
            onValueChange = {
                username = it
                viewModel.updateUsername(it)
            },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Username") }
        )
        Spacer(modifier=Modifier.height(20.dp))
        Button(
            onClick = {viewModel.fetchUserInfo()},
        ) {
            Text(text = "Fetch Data")
        }
    }
}
@Preview(device = "spec:width=411dp,height=891dp")
@Composable
fun HelloPreview(){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Hello()
    }
}