package com.capstone.herbs.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.yourapp.databinding.ActivityEditProfileBinding

class EditActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivCamera.setOnClickListener {
        }

        binding.ivEditUsername.setOnClickListener {
        }

        binding.ivEditEmail.setOnClickListener {
        }

        binding.ivEditPassword.setOnClickListener {
        }

        binding.ivEditPhoneNumber.setOnClickListener {
        }

        binding.ivProfilePic1.setOnClickListener {
        }

        binding.ivProfilePic2.setOnClickListener {
        }

        binding.ivProfilePic3.setOnClickListener {
        }

        binding.ivDelete.setOnClickListener {
        }
    }
}
