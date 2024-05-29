package com.capstone.herbs.ui.main

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.capstone.herbs.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameInput: EditText = findViewById(R.id.usernameInput)
        val passwordInput: EditText = findViewById(R.id.passwordInput)
        val loginButton: Button = findViewById(R.id.loginButton)
        val signupPrompt: TextView = findViewById(R.id.signupPrompt)

        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {

                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show()
            }
        }

        signupPrompt.setOnClickListener {

            Toast.makeText(this, "Sign up clicked", Toast.LENGTH_SHORT).show()

        }
    }
}