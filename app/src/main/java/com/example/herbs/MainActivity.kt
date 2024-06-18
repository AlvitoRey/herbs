package com.example.herbs

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.view.View
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.herbs.DataSource.spices
import com.example.herbs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var spiceAdapter: SpiceAdapter
    private lateinit var binding: ActivityMainBinding
    private lateinit var searchSpiceAdapter: SearchSpiceAdapter
    private lateinit var mylist: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        setupSearchRecyclerView()

        val spices = DataSource.spices
        spiceAdapter.spices = spices
        searchSpiceAdapter.spices = spices
        mylist = ArrayList(spices.map { it.name })

        binding.detectButton.setOnClickListener {
            val intent = Intent(this, ClassifyActivity::class.java)
            startActivity(intent)
        }

        binding.ivProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        binding.btnExplore.setOnClickListener {
            val intent = Intent(this, SearchSpiceActivity::class.java)
            startActivity(intent)
        }

        binding.btnRecipe.setOnClickListener {
            val intent = Intent(this, SearchRecipeActivity::class.java)
            startActivity(intent)
        }

        binding.btnFindRecipe.setOnClickListener {
            val intent = Intent(this, SearchRecipeActivity::class.java)
            startActivity(intent)
        }



        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                binding.searchView.clearFocus()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText!!.isNotBlank()) {
                    binding.mainConstraintLayout.visibility = View.GONE
                    binding.rvSearchSpice.visibility = View.VISIBLE
                    searchSpiceAdapter.filter.filter(newText)
                }
                else {
                    binding.mainConstraintLayout.visibility = View.VISIBLE
                    binding.rvSearchSpice.visibility = View.GONE
                    binding.searchView.clearFocus()
                }
                return false
            }
        })

        binding.searchView.setOnCloseListener {
            binding.searchView.clearFocus()
            false
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

    private fun setupSearchRecyclerView() = binding.rvSearchSpice.apply {
        searchSpiceAdapter = SearchSpiceAdapter()
        searchSpiceAdapter.setClickListener(object : SearchSpiceAdapter.ClickListener {
            override fun onItemClicked(spice: Spice) {
                val intent = Intent(this@MainActivity, DetailSpiceActivity::class.java)
                intent.putExtra("name", spice.name)
                intent.putExtra("type", spice.type)
                startActivity(intent)
            }
        })
        adapter = searchSpiceAdapter
        layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}