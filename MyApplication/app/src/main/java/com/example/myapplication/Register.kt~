package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.activity.ComponentActivity

class Register: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val registerLink =findViewById<TextView>(R.id.textView5)

        registerLink.text=android.text.Html.fromHtml(getString(R.string.Login))
        registerLink.movementMethod = LinkMovementMethod.getInstance()

        // Handle clicks
        registerLink.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


    }
}