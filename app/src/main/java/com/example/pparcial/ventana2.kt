package com.example.pparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)
        fotos()
        regresar()
    }
    fun fotos(){
        val bot = findViewById<Button>(R.id.fotos)

        bot.setOnClickListener(){

            val saltar: Intent = Intent(this, ventana4::class.java)
            startActivity(saltar)
        }
    }

    fun regresar(){
        val bot = findViewById<Button>(R.id.reg)

        bot.setOnClickListener(){

            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }
}