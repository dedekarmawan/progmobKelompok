package com.example.destinasiwisatabali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class WisataAlamActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<WisataAlam> list = new ArrayList<>();
    String tittle = "Wisata Alam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        setActionBarTittle(tittle);
        list.addAll(WisataAlamData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAlamAdapter listWisataAlamAdapter = new ListWisataAlamAdapter(this);
        listWisataAlamAdapter.setListWisataAlam(list);
        rvCategory.setAdapter(listWisataAlamAdapter);
    }

    private void setActionBarTittle(String tittle) {
        getSupportActionBar().setTitle(tittle);
    }
}
