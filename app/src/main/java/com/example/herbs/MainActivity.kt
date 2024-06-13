package com.example.herbs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.herbs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var studentAdapter: StudentAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()

        studentAdapter.students = DataSource.students
    }

    private fun setupRecyclerView() = binding.rvSpice.apply {
        studentAdapter = StudentAdapter()
        studentAdapter.setClickListener(object : StudentAdapter.ClickListener {
            override fun onItemClicked(student: Student) {
                val intent = Intent(this@MainActivity, DetailSpiceActivity::class.java)
                intent.putExtra("name", student.name)
                intent.putExtra("nim", student.nim)
                startActivity(intent)
            }
        })
        adapter = studentAdapter
        layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}