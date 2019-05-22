package com.example.destinasiwisatabali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HiburanActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Hiburan> list = new ArrayList<>();
    String tittle = "Hiburan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiburan);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        setActionBarTittle(tittle);
        list.addAll(HiburanData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListHiburanAdapter listHiburanAdapter = new ListHiburanAdapter(this);
        listHiburanAdapter.setListHiburan(list);
        rvCategory.setAdapter(listHiburanAdapter);
    }

    private void setActionBarTittle(String tittle) {
        getSupportActionBar().setTitle(tittle);
    }
}
