package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckingOrder extends AppCompatActivity {
    public static final String ORDER_NO = "order_no";
    private String [] ordering_store = {"阿里郎韓式小館"};
    private String [] Status = {"訂單成立","商品運送中","已送達","已取消"};
    TextView tvOrdername,tvStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checking_order);

        tvOrdername = findViewById(R.id.tv_order_name);
        tvStatus = findViewById(R.id.tv_status);
        ListView lvcheckorder = this.findViewById(R.id.lv_checkorder);
        ArrayList<OrderItem> OrderingStorelist = new ArrayList<OrderItem>();

        for (int i = 0; i < ordering_store.length; i++) {
            OrderingStorelist.add(new OrderItem(ordering_store[i],Status[i]));
        }
        OrderArrayAdapter adapter = new OrderArrayAdapter(CheckingOrder.this, R.layout.order_status_list, OrderingStorelist);
        lvcheckorder.setAdapter(adapter);

        lvcheckorder.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent();
                intent.setClass(CheckingOrder.this, Order.class);
                intent.putExtra(ORDER_NO, position);
                startActivity(intent);

            }
        });
    }

    public void onclick(View v){
        switch (v.getId()){

            case R.id.btn_back:
                finish();
                break;
        }
    }
}