package com.example.tugasintent

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Awal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awal)
        // Inisialisasi komponen
        val buttonPenjelasan = findViewById<LinearLayout>(R.id.buttonPenjelasan)
        val buttonImplementasi = findViewById<LinearLayout>(R.id.buttonImplementasi)
        val buttonAnggota = findViewById<LinearLayout>(R.id.buttonAnggota)
        // Aksi ketika tombol di klik
        buttonPenjelasan.setOnClickListener {
            intent = Intent(this, Penjelasan::class.java)
            startActivity(intent)
        }
        buttonImplementasi.setOnClickListener {
            intent = Intent(this, Form::class.java)
            startActivity(intent)
        }
        buttonAnggota.setOnClickListener {
            intent = Intent(this, AnggotaKelompok::class.java)
            startActivity(intent)
        }
    }
}