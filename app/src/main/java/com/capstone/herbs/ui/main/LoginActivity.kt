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

        // Menghubungkan elemen-elemen di layout dengan variabel di kode
        val usernameInput: EditText = findViewById(R.id.usernameInput)
        val passwordInput: EditText = findViewById(R.id.passwordInput)
        val loginButton: Button = findViewById(R.id.loginButton)
        val signupPrompt: TextView = findViewById(R.id.signupPrompt)

        // Menangani event klik pada tombol "LOGIN"
        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Lakukan proses login (misalnya, memverifikasi kredensial)
                // Ini hanya contoh, Anda bisa menambahkan logika login yang sesuai di sini
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show()
            }
        }

        // Menangani event klik pada teks "Sign up"
        signupPrompt.setOnClickListener {
            // Pindah ke aktivitas atau fragment pendaftaran
            Toast.makeText(this, "Sign up clicked", Toast.LENGTH_SHORT).show()
            // Contoh, buka activity pendaftaran
            // val intent = Intent(this, SignupActivity::class.java)
            // startActivity(intent)
        }
    }
}