package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingcarActivity extends AppCompatActivity {
    private String[] shoppingcar;
    ListView lvshopcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcar);


        lvshopcar = findViewById(R.id.lv_shoppingcar);
        ArrayAdapter adapter = new ArrayAdapter(ShoppingcarActivity.this, android.R.layout.simple_list_item_1, StoreList.inshoppingcar);

        lvshopcar.setAdapter(adapter);
    }
    public void onclick(View v) {
        switch (v.getId()) {
            case R.id.ib_home:
                Intent intent2 = new Intent(ShoppingcarActivity.this, MainActivity.class);
                startActivity(intent2);
                break;
            case R.id.ib_shpooingcar:
                break;
            case R.id.ib_menu:
                Intent intent3 = new Intent(ShoppingcarActivity.this, MenuActivity.class);
                startActivity(intent3);
                break;
        }
    }
}