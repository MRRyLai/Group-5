package com.example.group5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class delivery_HP extends AppCompatActivity {

    String orderlist[] = {"order1", "order2", "order3"};
    int orderImages [] = {R.drawable.deliver_list, R.drawable.deliver_list, R.drawable.deliver_list};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_hp);

        listView = (ListView) findViewById(R.id.LV_orderlist);
        orderlistAdapter orderlistAdapter = new orderlistAdapter(getApplicationContext(),orderlist, orderImages);
        listView.setAdapter(orderlistAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(delivery_HP.this, del_order1.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(delivery_HP.this, del_order2.class);
                    startActivity(intent);
                }
                /*
                else if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(delivery_HP.this, customer_service.class);
                    startActivity(intent);
                }
                */
            }
        });

    }


    public void onclick(View v){
        switch (v.getId()){

            case R.id.del_home2:
                break;
            case R.id.del_menu2:
                Intent intent1 = new Intent(this, delivery_setting.class);
                startActivity(intent1);
                break;

        }
    }
}
