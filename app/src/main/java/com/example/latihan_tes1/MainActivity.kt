package com.example.latihan_tes1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val _email = findViewById<LinearLayout>(R.id.email)
        _email.setOnClickListener {
            val _sendIntent = Intent().apply {
                data = Uri.parse("mailto:sarah@school.edu")
            }
            startActivity(_sendIntent)
        }

        val _telephone = findViewById<LinearLayout>(R.id.telephone)
        _telephone.setOnClickListener {
            val _sendIntent = Intent().apply {
                data = Uri.parse("tel:+15559876547")
            }
            startActivity(_sendIntent)
        }
    }

}