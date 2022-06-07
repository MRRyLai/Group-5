package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choose_identity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_identity);
    }

    public void goto_MainActivity(View view){
        Intent it = new Intent(this,MainActivity.class );
        startActivity(it);
    }

    public void goto_shop_host(View view){
        Intent it = new Intent(this,shop_host.class );
        startActivity(it);
    }

   /* public void goto_delivery_man(View view){
        Intent it = new Intent(this,MainActivity.class );
        startActivity(it);
    }*/
}