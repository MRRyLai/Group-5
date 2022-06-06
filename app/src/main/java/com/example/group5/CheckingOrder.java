package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CheckingOrder extends AppCompatActivity {
    public static final String ORDER_NO = "order_no";
    private String [] ordering_store = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checking_order);

        ListView lvcheckorder = this.findViewById(R.id.lv_checkorder);
        ArrayList<String> OrderingStorelist = new ArrayList<>();
        if (ordering_store.length == 0) {
            OrderingStorelist.add("目前沒有訂單");
        } else {
            for (int i = 0; i < ordering_store.length; i++) {
                OrderingStorelist.add(ordering_store[i]);
            }
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, OrderingStorelist);
        lvcheckorder.setAdapter(adapter);

    }

    public void onclick(View v){
        switch (v.getId()){

            case R.id.btn_back:
                finish();
                break;
        }
    }
}