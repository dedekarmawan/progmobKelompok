package com.example.destinasiwisatabali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Buleleng extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Wisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buleleng);
        rvCategory = findViewById(R.id.Buleleng);
        rvCategory.setHasFixedSize(true);

        list.addAll(BulelengData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListKabupatenAdapter listKabupatenAdapter = new ListKabupatenAdapter(this);
        listKabupatenAdapter.setListWisata(list);
        rvCategory.setAdapter(listKabupatenAdapter);
    }
}
