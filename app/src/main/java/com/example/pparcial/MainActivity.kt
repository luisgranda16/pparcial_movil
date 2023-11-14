package com.example.pparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.schedule
import kotlin.concurrent.scheduleAtFixedRate
import kotlin.concurrent.thread
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(3000)
        installSplashScreen()

        setContentView(R.layout.activity_main)
        ingresar()
        registrarse()
    }

    fun ingresar(){
        val bot = findViewById<Button>(R.id.ingresar)

        bot.setOnClickListener(){

            val saltar: Intent = Intent(this, ventana2::class.java)
            startActivity(saltar)
        }
    }

    fun registrarse(){
        val bot = findViewById<Button>(R.id.registro)

        bot.setOnClickListener(){

            val saltar: Intent = Intent(this, ventana3::class.java)
            startActivity(saltar)
        }
    }

}