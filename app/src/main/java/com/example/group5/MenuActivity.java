package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    public static final String MENU_NO = "menu_no";
    private String [] functions = {"用戶設定","查詢訂單","尋求客服"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView lvmenu = this.findViewById(R.id.lv_menu);

        ArrayList<String> menulist = new ArrayList<>();
        for(int i = 0;i<functions.length;i++){
            menulist.add(functions[i]);
        }
        ArrayAdapter<String>adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,menulist);
        lvmenu.setAdapter(adapter);
    }
    public void onclick(View v){
        switch (v.getId()){

            case R.id.ib_home:
                finish();
                break;
            case R.id.ib_shpooingcar:
                Intent intent = new Intent(this, ShoppingcarActivity.class);
                startActivity(intent);
                break;
            case R.id.ib_menu:
                break;
        }
    }

}