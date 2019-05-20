package com.example.destinasiwisatabali;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

public class Denpasar extends AppCompatActivity {
    String tittle ="Denpasar";
    private RecyclerView rvCategory;
    private ArrayList<Wisata> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denpasar);
        rvCategory = findViewById(R.id.denpasar);
        rvCategory.setHasFixedSize(true);

        setActionBarTittle(tittle );

        list.addAll(DenpasarData.getListData());
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        showRecyclerList();
    }

    private void setActionBarTittle(String tittle) {
        getSupportActionBar().setTitle(tittle);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListKabupatenAdapter listKabupatenAdapter = new ListKabupatenAdapter(this);
        listKabupatenAdapter.setListWisata(list);
        rvCategory.setAdapter(listKabupatenAdapter);
    }
}
