package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
    }
}