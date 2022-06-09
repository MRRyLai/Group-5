package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class on_to_offstatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_to_offstatus);
    }

    public void onclick(View v){
        switch (v.getId()){


            case R.id.btn_offwork:
                Intent intent = new Intent(this, del_setpage_off.class);
                startActivity(intent);
                break;
            case R.id.btn_staReturnSet_on:
                Intent intent1 = new Intent(this, delivery_setting.class);
                startActivity(intent1);
                break;
        }
    }
}