package com.example.androidadvance_recyclerviewwithinterface.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidadvance_recyclerviewwithinterface.Interface.RecyclerClickListener
import com.example.androidadvance_recyclerviewwithinterface.R
import kotlinx.android.synthetic.main.recyclerview_item.view.*

class RecyclerViewAdapterKotlin(val names: List<String>,val clickListener: RecyclerClickListener) : RecyclerView.Adapter<RecyclerViewAdapterKotlin.RecyclerViewAdapterViewHolder>() {

    override fun onCreateViewHolder(v: ViewGroup, p1: Int): RecyclerViewAdapterViewHolder {
        val view: View = LayoutInflater.from(v.context).inflate(R.layout.recyclerview_item, v, false)
        return RecyclerViewAdapterViewHolder(view,clickListener)
    }

    override fun getItemCount() = names.size

    override fun onBindViewHolder(holder: RecyclerViewAdapterViewHolder, p: Int) {
        holder.onBind(names[p])
    }

    class RecyclerViewAdapterViewHolder(val itemview: View,val clickListener: RecyclerClickListener) : RecyclerView.ViewHolder(itemview) {
        fun onBind(name: String) {
            itemView.txtName.text = name
            itemView.setOnClickListener {
                clickListener.OnClick(name)
            }

        }
    }


}