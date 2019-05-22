package com.example.destinasiwisatabali;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class BahasaActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnGantiBahasa;
    private TextView tvBahasaSaatIni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahasa);

        tvBahasaSaatIni = findViewById(R.id.tv_bahasa_saat_ini);
        btnGantiBahasa = findViewById(R.id.btn_ganti_bahasa);

        tvBahasaSaatIni.setText(getString(R.string.bahasa_saat_ini) + " " + Locale.getDefault().getDisplayLanguage());

        btnGantiBahasa.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        if(v==btnGantiBahasa){
            Intent intent=new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intent);
        }
    }
}

