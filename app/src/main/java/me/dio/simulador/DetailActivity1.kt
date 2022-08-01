package me.dio.simulador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.simulador.databinding.ActivityDetail1Binding

class DetailActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityDetail1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityDetail1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



    }
}