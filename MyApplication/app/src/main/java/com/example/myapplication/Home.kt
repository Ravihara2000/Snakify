package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val profileLink = findViewById<ImageButton>(R.id.imageButton2)
        profileLink.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val aboutLink = findViewById<Button>(R.id.button2)
        aboutLink.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }

        val displayLink = findViewById<Button>(R.id.button5)
        displayLink.setOnClickListener {
            val intent = Intent(this, Display::class.java)
            startActivity(intent)
        }
    }
}