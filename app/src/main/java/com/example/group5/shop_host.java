package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shop_host extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_host);
    }

    public void goto_catch_order(View view){
        Intent it = new Intent(this,catch_order.class );
        startActivity(it);
    }

    public void goto_business(View view){
        Intent it = new Intent(this,business.class );
        startActivity(it);
    }

    public void goto_want_sell(View view){
        Intent it = new Intent(this, want_sell.class );
        startActivity(it);
    }

    public void goto_customer_service(View view){
        Intent it = new Intent(this,customer_service.class );
        startActivity(it);
    }

   public void goto_choose_identity(View view){
        Intent it = new Intent(this,choose_identity.class );
        startActivity(it);
    }



}