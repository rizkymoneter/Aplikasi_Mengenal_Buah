package com.example.aplikasimengenalbuah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //variable log TAG
    private static final String TAG = "DetailActivity";

    //Inisialisasi variabel untuk GUI
    TextView    tvnamaBuah;
    ImageView   ivgambarBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namabuah = getIntent().getStringExtra(Konstanta.DATANAMA);
        int gambarbuah  = getIntent().getIntExtra(Konstanta.DATAGAMBAR, 0);

        //membuat log
        Log.d(TAG, "Nama" + namabuah);
        Log.d(TAG, "Gambar" + gambarbuah);

        tvnamaBuah = findViewById(R.id.tv_detail_nama);
        ivgambarBuah = findViewById(R.id.iv_detail_gambar);

        tvnamaBuah.setText(namabuah);
        ivgambarBuah.setImageResource(gambarbuah);
    }
}