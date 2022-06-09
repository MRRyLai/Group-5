package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class del_order2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del_order2);
    }

    public void onclick(View v){
        switch (v.getId()){

            case R.id.btn_takeorder2:
                Intent intent2 = new Intent(this, del_order2_take.class);
                startActivity(intent2);
                break;

            case R.id.del_home6:
                Intent intent = new Intent(this, delivery_HP.class);
                startActivity(intent);
                break;
            case R.id.del_delList6:
                Toast.makeText(del_order2.this, "尚未接取訂單", Toast.LENGTH_SHORT).show();
                break;
            case R.id.del_menu6:
                Intent intent1 = new Intent(this, delivery_setting.class);
                startActivity(intent1);
                break;

        }
    }
}