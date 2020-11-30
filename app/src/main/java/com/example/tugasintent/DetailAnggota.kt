package com.example.tugasintent

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class DetailAnggota : AppCompatActivity() {
    private lateinit var imageAnggota: ImageView
    private lateinit var tvNama: TextView
    private lateinit var tvNim: TextView
    private lateinit var tvProdi: TextView
    private lateinit var tvAsal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_anggota)

        // Inisialisasi komponen
        imageAnggota = findViewById(R.id.imageAnggota)
        tvNama = findViewById(R.id.namaAnggota)
        tvNim = findViewById(R.id.nimAnggota)
        tvProdi = findViewById(R.id.prodiAnggota)
        tvAsal = findViewById(R.id.asalAnggota)

        // Mengubah isi pada komponen
        imageAnggota.setImageDrawable(ContextCompat.getDrawable(this, intent.getIntExtra("image", R.drawable.iconfinder_account_add_2202248)))
        tvNama.text = intent.getStringExtra("nama")
        tvNim.text = intent.getStringExtra("nim")
        tvProdi.text = intent.getStringExtra("programstudi")
        tvAsal.text = intent.getStringExtra("asal")
    }
}
