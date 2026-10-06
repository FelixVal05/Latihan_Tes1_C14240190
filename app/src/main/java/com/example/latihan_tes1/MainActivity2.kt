package com.example.latihan_tes1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val _btnAdmin = findViewById<Button>(R.id.btnAdmin)
        _btnAdmin.setOnClickListener {
            val intentWithData = Intent(
                this@MainActivity2,
                MainActivity::class.java
            ).apply {
                putExtra(MainActivity.dataTerima,"Admin")
            }
            startActivity(intentWithData)
        }

        val _btnUser = findViewById<Button>(R.id.btnUser)
        _btnUser.setOnClickListener {
            val intentWithData = Intent(
                this@MainActivity2,
                MainActivity::class.java
            ).apply {
                putExtra(MainActivity.dataTerima,"User")
            }
            startActivity(intentWithData)
        }

        val _btnGuest = findViewById<Button>(R.id.btnGuest)
        _btnGuest.setOnClickListener {
            val intentWithData = Intent(
                this@MainActivity2,
                MainActivity::class.java
            ).apply {
                putExtra(MainActivity.dataTerima,"Guest")
            }
            startActivity(intentWithData)
        }
    }
}