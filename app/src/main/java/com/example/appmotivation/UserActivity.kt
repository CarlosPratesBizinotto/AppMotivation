package com.example.appmotivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.appmotivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Esconder a barra de navegação
        supportActionBar?.hide()

        //Eventos
        binding.buttonSaveName.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.buttonSaveName){
            testeButtonUser()
        }
    }
    private fun testeButtonUser(){
        Toast.makeText(this, "Esse botão UserActivity foi clicado.", Toast.LENGTH_SHORT).show()
    }

}

