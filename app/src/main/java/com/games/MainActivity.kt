package com.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.games.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    private var listGame:ArrayList<Games> = arrayListOf()
    val adapterList = AdapterGamesList(listGame)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listGame.add(Games("Кестики нолики",1))
        listGame.add(Games("Угадай Число",2))


        binding.recycler.adapter = adapterList

    }
}