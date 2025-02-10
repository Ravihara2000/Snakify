package com.example.myapplication

import android.app.Activity
import android.os.Bundle

class About: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
    }
}