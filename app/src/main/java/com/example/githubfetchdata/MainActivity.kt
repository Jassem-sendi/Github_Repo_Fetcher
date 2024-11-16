package com.example.githubfetchdata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.LaunchedEffect
import com.example.compose.GitHubFetchDataTheme
import com.example.githubfetchdata.data.api.Client
import com.example.githubfetchdata.data.api.UserRepositoryImpl
import com.example.githubfetchdata.domain.UserRepository

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitHubFetchDataTheme {
                LaunchedEffect(Unit) {
                    val userRepository = UserRepositoryImpl(Client()).getUserData("Jassem_sendi")
                    println("User Data: "+userRepository)
                }
            }
        }
    }
}

