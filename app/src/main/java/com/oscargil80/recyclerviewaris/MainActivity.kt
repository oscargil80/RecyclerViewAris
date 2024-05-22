package com.oscargil80.recyclerviewaris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.oscargil80.recyclerviewaris.adapter.SuperHeroAdapter
import com.oscargil80.recyclerviewaris.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.recyclerSuperhero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperhero.adapter = SuperHeroAdapter(SuperHeroProvider.superheroList) { superhero ->
            onItemSelected(
                superhero
            )
        }
    }

    fun onItemSelected(superHero: SuperHero){
   Toast.makeText(this, superHero.superhero, Toast.LENGTH_SHORT).show()
    }

}