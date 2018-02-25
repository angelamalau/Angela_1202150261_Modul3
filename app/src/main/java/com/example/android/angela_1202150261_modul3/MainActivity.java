package com.example.android.angela_1202150261_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Merek;
    private ArrayList<String> Ket;
    private ArrayList<Integer> Gambar;

    //daftar minuman kemasan
    private String[] merek = {"Ades","Amidis","Aqua","Cleo","Club","Equil","Evian","Le Minerale","Nestle","Pristine","Vit"};

    //keterangan minuman kemasan
    private String[] ket = {"Ini adalah minuman merek Ades","Ini adalah minuman merek Amidis","Ini adalah minuman merek Aqua",
            "Ini adalah minuman merek Cleo","Ini adalah minuman merek Club","Ini adalah minuman merek Equil","Ini adalah minuman merek Evian",
            "Ini adalah minuman merek Le Minerale","Ini adalah minuman merek Nestle","Ini adalah minuman merek Pristine","Ini adalah minuman merek Vit"};

    //daftar gambar minuman kemasan
    private int[] gambar = {
            R.drawable.ades,
            R.drawable.amidis,
            R.drawable.aqua,
            R.drawable.cleo,
            R.drawable.club,
            R.drawable.equil,
            R.drawable.evian,
            R.drawable.leminerale,
            R.drawable.nestle,
            R.drawable.pristine,
            R.drawable.vit
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //membuat arrayList
        Merek = new ArrayList<>();
        Ket = new ArrayList<>();
        Gambar = new ArrayList<>();

        //inisiasi untuk mencari resource recyclerview
        recyclerView = findViewById(R.id.recyclerview);

        DaftarItem();
        //menggunakan layout manager, dan membuat list secara vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(Merek, Ket, Gambar);

        //memasang adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    //eksekusi daftar item
    private void DaftarItem() {
        for (int a=0; a<merek.length; a++) {
            Gambar.add(gambar[a]);
            Merek.add(merek[a]);
            Ket.add(ket[a]);
        }
    }
}
