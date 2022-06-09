package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class del_order1 extends AppCompatActivity {

    String foodOrdered [] = {"辣炒年糕", "炸醬麵", "起司炸雞"};
    String orderedAmo [] = {"*2", "*1", "*1"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del_order1);

        listView = (ListView) findViewById(R.id.lv_order_list);
        delOrderLVAdapter delOrderLVAdapter = new delOrderLVAdapter(getApplicationContext(),foodOrdered, orderedAmo);
        listView.setAdapter(delOrderLVAdapter);
    }

    public void onclick(View v){
        switch (v.getId()){

            case R.id.btn_takeorder1:
                Intent intent2 = new Intent(this, del_order1_take.class);
                startActivity(intent2);
                break;

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