package com.capstone.herbs.ui.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.herbs.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up any necessary listeners or initial setup here
        binding.tvEdit.setOnClickListener {
            // Handle edit button click
        }

        binding.btnLogout.setOnClickListener {
            // Handle logout button click
        }
    }
}