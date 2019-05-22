package com.example.destinasiwisatabali;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class ReligiActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Religi> list = new ArrayList<>();
    String tittle="Religi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religi);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        setActionBarTittle(tittle);
        list.addAll(ReligiData.getListData());
        showRecyclerList();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListReligiAdapter listReligiAdapter = new ListReligiAdapter(this);
        listReligiAdapter.setListReligi(list);
        rvCategory.setAdapter(listReligiAdapter);
    }

    private void setActionBarTittle(String tittle) {
        getSupportActionBar().setTitle(tittle);
    }

}
