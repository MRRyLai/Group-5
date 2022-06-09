package com.example.group5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group5.databinding.ActivityMainBinding;

public class delivery_HP extends AppCompatActivity {

    String orderlist[] = {"order1", "order2", "order3"};
    int orderImages [] = {R.drawable.deliver_list, R.drawable.deliver_list, R.drawable.deliver_list};

    ListView listView;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listView = (ListView) findViewById(R.id.LV_orderlist);
        orderlistAdapter orderlistAdapter = new orderlistAdapter(getApplicationContext(),orderlist, orderImages);
        listView.setAdapter(orderlistAdapter);

    }


    public void onclick(View v){
        switch (v.getId()){

            case R.id.del_home2:
                break;
            case R.id.del_menu2:
                Intent intent1 = new Intent(this, delivery_setting.class);
                startActivity(intent1);

        }
    }
}
