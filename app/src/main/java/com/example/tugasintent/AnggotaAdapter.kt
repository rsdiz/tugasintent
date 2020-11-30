package com.example.tugasintent

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class AnggotaAdapter(var mycontext: Context, var resource: Int, var item: List<Anggota>) :
    ArrayAdapter<Anggota>(mycontext, resource, item) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(mycontext)
        val view = layoutInflater.inflate(resource, null)
        //Inisialisasi
        val nama_anggota = view.findViewById<TextView>(R.id.nama_anggota)
        //Data
        val model = item[position]
        nama_anggota.text = model.nama
        return view
    }
}
