package com.recycl.fibonacci
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.Adapter
import java.text.FieldPosition

class NamesRvAdapter(var namelist: List<String>): Adapter<NamesRvAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_numbers_list, parent, false)
        return NamesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return namelist.size

    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        var currentName = namelist.get(position)
        holder.tvItem.text = currentName
    }


    class NamesViewHolder(itemView: View) : ViewHolder(itemView) {
        var tvItem = itemView.findViewById<TextView>(R.id.rvNumbers)
    }
}

