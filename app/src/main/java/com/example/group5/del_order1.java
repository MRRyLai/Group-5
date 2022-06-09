package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class del_order1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del_order1);
    }

    public void onclick(View v){
        switch (v.getId()){

            case R.id.del_home5:
                Intent intent = new Intent(this, delivery_HP.class);
                startActivity(intent);
                break;
            case R.id.del_delList5:
                Toast.makeText(del_order1.this, "尚未接取訂單", Toast.LENGTH_SHORT).show();
                break;
            case R.id.del_menu5:
                Intent intent1 = new Intent(this, delivery_setting.class);
                startActivity(intent1);
                break;

        }
    }
}