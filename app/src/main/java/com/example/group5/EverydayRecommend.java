package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EverydayRecommend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_everyday_recommend);
    }
    public void onclick(View v){
        switch (v.getId()){

            case R.id.ib_home:
                finish();
                break;
            case R.id.ib_shpooingcar:
                Intent intent = new Intent(this, ShoppingcarActivity.class);
                startActivity(intent);
                break;
            case R.id.ib_menu:
                Intent intent1 = new Intent(this, MenuActivity.class);
                startActivity(intent1);
                break;
        }
    }
}