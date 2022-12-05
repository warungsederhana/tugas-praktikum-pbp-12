package com.example.pertemuan_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Button btnAdd = findViewById(R.id.add_mhs);
//        btnAdd.setOnClickListener(this);
//
//        Button btnList = findViewById(R.id.list_mhs);
//        btnList.setOnClickListener(this);
    }

    public void pindah(View view) {
        switch(view.getId()){
            case R.id.add_mhs:
                Intent moveAdd = new Intent(MainActivity.this, TambahMhsActivity.class);
                startActivity(moveAdd);
                break;
            case R.id.list_mhs:
                Intent moveList = new Intent(MainActivity.this, ListMhsActivity.class);
                startActivity(moveList);
                break;
        }
    }
}