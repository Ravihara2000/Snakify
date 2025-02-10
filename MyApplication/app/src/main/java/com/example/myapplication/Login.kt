package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val registerLink = findViewById<TextView>(R.id.textView5)
        registerLink.text = android.text.Html.fromHtml(getString(R.string.Register))
        registerLink.movementMethod = LinkMovementMethod.getInstance()

        // Handle clicks
        registerLink.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        val homeLink = findViewById<Button>(R.id.loginButton)
        homeLink.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}