package com.example.githubfetchdata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.ui.Modifier
import com.example.compose.GitHubFetchDataTheme
import com.example.githubfetchdata.ui.helloPage.Hello

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitHubFetchDataTheme {
                Hello(modifier = Modifier.safeDrawingPadding())
            }
        }
    }
}

