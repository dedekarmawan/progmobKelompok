package com.example.destinasiwisatabali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class KategoriActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView ivReligi;
    ImageView ivAlam;
    ImageView ivWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        ivReligi = findViewById(R.id.iv_religi);
        ivReligi.setOnClickListener(this);

        ivAlam = findViewById(R.id.iv_alam);
        ivAlam.setOnClickListener(this);

        ivWisata = findViewById(R.id.iv_wisata);
        ivWisata.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_religi:
                Intent moveIntent = new Intent(KategoriActivity.this, ReligiActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.iv_alam:
                Intent moveIntent2 = new Intent(KategoriActivity.this, WisataAlamActivity.class);
                startActivity(moveIntent2);
                break;
            case R.id.iv_wisata:
                Intent moveIntent3 = new Intent(KategoriActivity.this, HiburanActivity.class);
                startActivity(moveIntent3);
                break;
        }
    }
}
