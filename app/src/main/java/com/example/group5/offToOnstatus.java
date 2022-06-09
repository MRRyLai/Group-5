package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class offToOnstatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_to_onstatus);
    }

    public void onclick(View v){
        switch (v.getId()){


            case R.id.btn_startwork:
                Intent intent = new Intent(this, delivery_setting.class);
                startActivity(intent);
                break;
            case R.id.btn_staReturnSet:
                Intent intent1 = new Intent(this, del_setpage_off.class);
                startActivity(intent1);
                break;
        }
    }

}