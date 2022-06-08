package com.example.group5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class delivery_HP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_hp);

    }


    public void onclick(View v){
        switch (v.getId()){

            case R.id.del_home2:
                break;
            case R.id.del_menu2:
                Intent intent1 = new Intent(this, delivery_setting.class);
                startActivity(intent1);

        }
    }
}
