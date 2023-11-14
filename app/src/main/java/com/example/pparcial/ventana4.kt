package com.example.pparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build

class ventana4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana4)
        regresar()
        val btnCam = findViewById<Button>(R.id.camara)
        btnCam.setOnClickListener {
            startForResult.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }
    }
    private val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                val imageBitmap = intent?.extras?.get("data") as Bitmap
                val img = findViewById<ImageView>(R.id.img)
                img.setImageBitmap(imageBitmap)
            }
        }
    fun regresar() {
        val bot = findViewById<Button>(R.id.regre)
        bot.setOnClickListener() {
            val saltar: Intent = Intent(this, ventana2::class.java)
            startActivity(saltar)
        }
    }
}