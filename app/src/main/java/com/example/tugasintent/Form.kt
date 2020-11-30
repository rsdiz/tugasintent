package com.example.tugasintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Form : AppCompatActivity() {
    private lateinit var etNama: EditText
    private lateinit var etNim: EditText
    private lateinit var etProdi: EditText
    private lateinit var etAsal: EditText
    private lateinit var btnSimpan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        // INISIALISASI
        etNama = findViewById(R.id.et_nama)
        etNim = findViewById(R.id.et_nim)
        etProdi = findViewById(R.id.et_prodi)
        etAsal = findViewById(R.id.et_asal)
        btnSimpan = findViewById(R.id.btn_simpan)

        // AKSI KETIKA BUTTON DI KLIK
        btnSimpan.setOnClickListener {
            // CEK EDIT TEXT KOSONG ATAU TIDAK
            if (
                etNama.text.isNullOrBlank()
                or etNim.text.isNullOrBlank()
                or etProdi.text.isNullOrBlank()
                or etAsal.text.isNullOrBlank()
            ) {
                Toast.makeText(this, "DATA BELUM LENGKAP", Toast.LENGTH_SHORT).show()
            } else {
                intent = Intent(this, Dataform::class.java)
                intent.putExtra("Nama", etNama.text)
                intent.putExtra("NIM", etNim.text)
                intent.putExtra("Programstudi", etProdi.text)
                intent.putExtra("Asal", etAsal.text)
                startActivity(intent)
            }
        }
    }
}
