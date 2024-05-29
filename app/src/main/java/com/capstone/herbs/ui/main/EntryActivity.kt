package com.capstone.herbs.ui.main

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.capstone.herbs.R

class EntryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the ImageView and Button
        val imageView = findViewById<ImageView>(R.id.imageView)
        val buttonGetStarted = findViewById<Button>(R.id.button_get_started)

        // Set a click listener on the button
        buttonGetStarted.setOnClickListener {
            // Handle button click
        }
    }
}
