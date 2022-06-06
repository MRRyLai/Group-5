package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityOffer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);
    }
    public void onclick(View v){
        switch (v.getId()){


            case R.id.ib_home:
                finish();
                break;
            case R.id.ib_shpooingcar:
                Intent intent2 = new Intent(this, ShoppingcarActivity.class);
                startActivity(intent2);
                break;
            case R.id.ib_menu:
                Intent intent3 = new Intent(this, MenuActivity.class);
                startActivity(intent3);
                break;
        }
    }
}