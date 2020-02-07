package com.example.androidadvance_recyclerviewwithinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.androidadvance_recyclerviewwithinterface.Adapter.RecyclerViewAdapter;
import com.example.androidadvance_recyclerviewwithinterface.Interface.RecyclerClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements RecyclerClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> names= new ArrayList<>();
        names.add("Hossein");
        names.add("Ali");
        names.add("Mohammad");
        names.add("Mina");

        RecyclerView recyclerView = findViewById(R.id.rv_Names);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(names,this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void OnClick(String Name) {
        Toast.makeText(this,"4545",Toast.LENGTH_LONG).show();
    }
}
