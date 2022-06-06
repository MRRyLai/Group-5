package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class catch_order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catch_order);

    }

    int a;

    public void set_busy(View view){
        a=1;
        Intent it = new Intent(this,shop_host.class );

        it.putExtra("catch",a);
        startActivity(it);

        Toast.makeText(this, "已將目前接單狀況設為:忙碌中", Toast.LENGTH_LONG).show();
    }
    public void set_normal(View view){
        a=2;
        Intent it = new Intent(this,shop_host.class );

        it.putExtra("catch",a);
        startActivity(it);

        Toast.makeText(this, "已將目前接單狀況設為:正常時段", Toast.LENGTH_LONG).show();
    }
    public void set_free(View view){
        a=3;
        Intent it = new Intent(this,shop_host.class );

        it.putExtra("catch",a);
        startActivity(it);

        Toast.makeText(this, "已將目前接單狀況設為:非巔峰時段", Toast.LENGTH_LONG).show();

    }

    public void go_back(View view){
        Intent it = new Intent(this,shop_host.class );
        startActivity(it);
    }
}