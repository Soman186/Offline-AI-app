package com.offlineai.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Welcome to Offline AI!"
        text.textSize = 24f
        text.gravity = android.view.Gravity.CENTER

        setContentView(text)
    }
}
