package com.alexandrestefani.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alexandrestefani.contactlist.databinding.LayoutcontactlistBinding

class ListAdapter(
    val listcontact:MutableList<ContactInfo>
        ): RecyclerView.Adapter<ListAdapter.ListViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewholder {
        return ListViewholder(LayoutcontactlistBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    class ListViewholder(binding: LayoutcontactlistBinding): RecyclerView.ViewHolder(binding.root){
        var posicao = binding.posicao
        var nome = binding.contato
        var telefone = binding.telefone
        var root = binding.root

    }
    override fun getItemCount(): Int {
        return listcontact.size
    }
    override fun onBindViewHolder(holder: ListViewholder, position: Int) {
        val item = listcontact[position]

        holder.posicao.text = position.toString()
        holder.nome.text = item.name
        holder.telefone.text = item.phone

    }





}
