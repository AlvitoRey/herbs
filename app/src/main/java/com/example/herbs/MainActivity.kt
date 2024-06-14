package com.example.herbs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.herbs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var spiceAdapter: SpiceAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()

        spiceAdapter.spices = DataSource.spices

        binding.detectButton.setOnClickListener {
            val intent = Intent(this, ClassifyActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupRecyclerView() = binding.rvSpice.apply {
        spiceAdapter = SpiceAdapter()
        spiceAdapter.setClickListener(object : SpiceAdapter.ClickListener {
            override fun onItemClicked(spice: Spice) {
                val intent = Intent(this@MainActivity, DetailSpiceActivity::class.java)
                intent.putExtra("name", spice.name)
                intent.putExtra("type", spice.type)
                startActivity(intent)
            }
        })
        adapter = spiceAdapter
        layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}