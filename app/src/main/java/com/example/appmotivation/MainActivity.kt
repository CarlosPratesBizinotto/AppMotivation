package com.example.appmotivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.appmotivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       //Esconder a barra de navegação
        supportActionBar?.hide()

        //Eventos
        binding.buttonNewPhrase.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.buttonNewPhrase){
            testeButton()
        }
    }
    
     fun testeButton(){
        Toast.makeText(this, "Esse botao Main foi clicado", Toast.LENGTH_SHORT).show()
    }
}