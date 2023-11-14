package com.example.pparcial

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import android.content.Intent
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import android.widget.Toast

class ventana3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana3)
        ingresar()
        registrarse()
    }

    fun ingresar(){
        val bot = findViewById<Button>(R.id.ingresar2)

        bot.setOnClickListener(){

            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }

    fun registrarse(){
        val bot = findViewById<Button>(R.id.registro2)

        bot.setOnClickListener(){

            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }
}