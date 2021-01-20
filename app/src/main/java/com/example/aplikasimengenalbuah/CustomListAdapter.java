package com.example.aplikasimengenalbuah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListAdapter extends ArrayAdapter {
    private Context context;
    private String[] namabuah;
    private int[] gambarbuah;


    //constructor untuk meinisialisai nilai default
    public CustomListAdapter(@NonNull  Context context, String[] namabuah, int[] gambarbuah) {
        super(context, R.layout.item_buah, namabuah);
        this.context = context;
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
    }

    //GET VIEW
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Mengatur layout item (diambil dari constructor)
        LayoutInflater layoutInflater;
            //(membuat object View untuk dapat memanggil item_buah.xml)
        View view = LayoutInflater.from(context).inflate(R.layout.item_buah, parent, false);

        //findViewById setiap komponen dari item (ini diambil dari Object View)
        TextView tvNamaBuah = view.findViewById(R.id.tv_detail_nama);
        ImageView ivGambarBuah = view.findViewById(R.id.iv_detail_gambar);

        //set data
        tvNamaBuah.setText(namabuah[position]);
        ivGambarBuah.setImageResource(gambarbuah[position]);

        return view;
    }
}
