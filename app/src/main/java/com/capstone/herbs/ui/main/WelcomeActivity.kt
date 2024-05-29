package com.capstone.herbs.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.capstone.herbs.R


class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the views
        val imageView = findViewById<ImageView>(R.id.imageView)
        val titleText = findViewById<TextView>(R.id.title_text)
        val subtitleText = findViewById<TextView>(R.id.subtitle_text)
        val loginButton = findViewById<Button>(R.id.login_button)
        val signupButton = findViewById<Button>(R.id.signup_button)
        val forgetPasswordText = findViewById<TextView>(R.id.forget_password_text)

        // Set click listeners for the buttons
        loginButton.setOnClickListener {
            // Handle login button click
        }

        signupButton.setOnClickListener {
            // Handle signup button click
        }

        forgetPasswordText.setOnClickListener {
            // Handle forget password text click
        }
    }
}