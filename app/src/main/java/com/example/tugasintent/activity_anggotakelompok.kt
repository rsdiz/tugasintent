package com.example.tugasintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class activity_anggotakelompok : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anggotakelompok)
        //inisialisasi komponen
        val listview = findViewById<ListView>(R.id.listAnggotaKelompok)
        //DATA SOURCE
        val data = mutableListOf<Anggota>()
        data.add(Anggota("Risma Nur O. B.", "5180411006", "S1 Informatika", "Pemalang"))
        data.add(Anggota("Riesmi Mardela", "5180411014", "S1 Informatika", "Pati"))
        data.add(Anggota("Erika Afrilia", "5180411029", "S1 Informatika", "GunungKidul"))
        data.add(Anggota("Taufik Ismail", "5180411074", "S1 Informatika", "Indramayu"))
        data.add(Anggota("Muh. Rosyid I.", "5180411122", "S1 Informatika", "Temanggung"))
        //Adapter
        listview.adapter = AnggotaAdapter(this, R.layout.row_anggotakelompok, data)
        //Aksi ketika diklik
        listview.setOnItemClickListener { parent, view, position, id ->
            val item = data[position]
            intent = Intent(this, DetailAnggota::class.java)
            intent.putExtra("nama", item.nama)
            intent.putExtra("nim", item.nim)
            intent.putExtra("programstudi", item.programstudi)
            intent.putExtra("asal", item.asal)
            startActivity(intent)
        }
    }
}