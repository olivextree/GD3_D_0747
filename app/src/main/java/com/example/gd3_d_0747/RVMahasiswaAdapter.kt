package com.example.gd3_d_0747

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_d_0747.entity.Mahasiswa

class RVMahasiswaAdapter (private val data: Array<Mahasiswa>) : RecyclerView.Adapter<RVMahasiswaAdapter.viewHolder>() {

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): viewHolder {
        // Disint kita menghubunakan layout item recycler view kita
        val itemView = LayoutInflater.from(parent.context) .inflate(R.layout.rv_item_mahasiswa, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        // Karena kite sudah mendefinisikan dan menghubungkan view kita,
        // kita bisa memakad view tersebut dan Melakukan set text pada view tersebut
        val currentItem = data[position]
        holder.tvNama.text = currentItem.name
        holder.tvDetails.text = "${currentItem.tahunMasuk} - ${currentItem.IPK}"
    }

    override fun getItemCount(): Int {
        // Disini kita memberitahu jumlah dari item pada recycler view kita.
        return data.size
    }

    // Kelas ini beraung untuk menghubungkan view viet yang ada pada item di recycler view kita.
    class viewHolder (itemView : View) : RecyclerView.ViewHolder (itemView) {
        val tvNama : TextView = itemView.findViewById(R.id.tv_nama)
        val tvDetails : TextView = itemView.findViewById(R.id.tv_details)
    }
}