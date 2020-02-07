package com.example.androidadvance_recyclerviewwithinterface

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidadvance_recyclerviewwithinterface.Adapter.RecyclerViewAdapter
import com.example.androidadvance_recyclerviewwithinterface.Adapter.RecyclerViewAdapterKotlin
import com.example.androidadvance_recyclerviewwithinterface.Interface.RecyclerClickListener
import kotlinx.android.synthetic.main.activity_main_kotlin.*

class MainActivityKotlin : AppCompatActivity(),RecyclerClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)


        //val list1:ArrayList<String>=ArrayList()
        val list = ArrayList<String>()
        list.add("Hossein")
        list.add("Ali")
        list.add("Mohamad")
        list.add("Mohsen")

        val adapter=RecyclerViewAdapterKotlin(list,this)
        rv_Names.adapter=adapter
    }

    override fun OnClick(Name: String?) {
        Toast.makeText(this,Name,Toast.LENGTH_LONG).show()
    }

}
