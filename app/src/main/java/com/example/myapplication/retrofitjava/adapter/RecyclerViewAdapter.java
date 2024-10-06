package com.example.myapplication.retrofitjava.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.retrofitjava.R;
import com.example.myapplication.retrofitjava.model.CryptoModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>{
    private ArrayList<CryptoModel> cryptoList;
    private String[] colors = {"#00FF00","#0000FF","#800080","#9FE2BF","#FFBF00","#40E0D0","#ff5733"};
    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RowHolder holder, int position) {
         holder.bind(cryptoList.get(position),colors,position);
    }

    @Override
    public int getItemCount() {
        return cryptoList.size();
    }

    static class RowHolder extends RecyclerView.ViewHolder {
        TextView textName;
        TextView textPrice;
        public RowHolder(@NonNull View itemView) {
            super(itemView);

        }
        public void bind(CryptoModel cryptoModel,String[] colors,Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position % 7]));
            textName = itemView.findViewById(R.id.text_name);
            textPrice = itemView.findViewById(R.id.text_price);
            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);

        }
    }
}
