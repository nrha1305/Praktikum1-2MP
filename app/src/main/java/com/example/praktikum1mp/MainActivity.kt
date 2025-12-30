package com.example.praktikum1mp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hubungkan button
        val btnOpen = findViewById<Button>(R.id.btnOpenLayoutPractice)

        // Aksi klik
        btnOpen.setOnClickListener {
            val intent = Intent(this, LayoutPracticeActivity::class.java)
            startActivity(intent)
        }

        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val btnToggle = findViewById<Button>(R.id.btnToggle)

        //status awal
        var isHalo = true

        //Event kook tombol
        btnToggle.setOnClickListener {
            if (isHalo) {
                tvMessage.text = "Selamat Datang di Perkuliahan Mobile Programming"
            isHalo = false
            }else{
            tvMessage.text ="Halo Nor Hayati"
            isHalo = true
            }
        }
    }
}