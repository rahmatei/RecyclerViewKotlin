package com.example.androidadvance_recyclerviewwithinterface.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidadvance_recyclerviewwithinterface.Interface.RecyclerClickListener;
import com.example.androidadvance_recyclerviewwithinterface.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    List<String> names;
    private RecyclerClickListener clickListener;

    public RecyclerViewAdapter(List<String> names , RecyclerClickListener clickListener) {
        this.names = names;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        return new RecyclerViewHolder(v,clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {
        recyclerViewHolder.onBind(names.get(i));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        public RecyclerViewHolder(@NonNull View itemView, final RecyclerClickListener clickListener) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
            txtName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickListener.OnClick(names.get(getAdapterPosition()));
                 //   Toast.makeText(view.getContext(),names.get(getAdapterPosition()).toString(),Toast.LENGTH_LONG).show();
                }
            });
        }

        public void onBind(String Name){
            txtName.setText(Name);
        }
    }
}
