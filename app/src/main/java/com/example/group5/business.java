package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.group5.shop_host;

public class business extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
    }

    int a;

    public void set_business(View view){
        a=4;
        Intent it = new Intent(this,shop_host.class );

        it.putExtra("business",a);
        startActivity(it);

        Toast.makeText(this, "已將目前營業狀態設為:營業中", Toast.LENGTH_LONG).show();
    }
    public void set_close(View view){
        a=5;
        Intent it = new Intent(this,shop_host.class );

        it.putExtra("business",a);
        startActivity(it);

        Toast.makeText(this, "已將目前營業狀態設為:非營業時間", Toast.LENGTH_LONG).show();

    }

    public void go_back(View view){
        Intent it = new Intent(this, shop_host.class );
        startActivity(it);
    }
}