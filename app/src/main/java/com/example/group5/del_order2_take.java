package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class del_order2_take extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del_order2_take);
    }

    public void onclick(View v){
        switch (v.getId()){

            case R.id.btn_delorder2:
                Intent intent = new Intent(this, delivery_HP.class);
                startActivity(intent);
                break;

            case R.id.disorder_2:
                Intent intent1 = new Intent(this, delivery_HP.class);
                startActivity(intent1);
                break;

            case R.id.del_home7:
                Toast.makeText(del_order2_take.this, "已有接取訂單，送達或棄單方能查看頁面", Toast.LENGTH_SHORT).show();
                break;
            case R.id.del_delList7:
                break;
            case R.id.del_menu7:
                Toast.makeText(del_order2_take.this, "送達或棄單方能查看頁面", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}