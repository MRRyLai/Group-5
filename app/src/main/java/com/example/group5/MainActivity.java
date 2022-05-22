package com.example.group5;

import static android.net.wifi.WifiConfiguration.Status.strings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    RecyclerViewAdapter mAdapter;
    public static final String STORE_NO = "store_no";
    ImageButton ib1,ib2;
    String[] fromColumns = {"飲料專區","炸物專區","日式料理","台灣小吃","韓式料理","冰品專區","義式料理","泰式料理"};
    int[] toViews = {R.drawable.food_drinks, R.drawable.food_fries,
            R.drawable.food_japanese, R.drawable.food_taiwanese_snake,
            R.drawable.food_korean,R.drawable.food_ice_cream,
            R.drawable.food_italy, R.drawable.food_thai};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        ArrayList arrayList = new ArrayList();
//        for (int i = 0; i < strings.length; i++) {
//            arrayList.add(strings[i]);
//        }
//        mAdapter = new RecyclerViewAdapter(arrayList);
//        recyclerView.setAdapter(mAdapter);

        GridView gv = (GridView)findViewById(R.id.gv_intrduce);

        gv.setAdapter(new ImageAdapter(this, fromColumns));
        gv.setNumColumns(2);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Log.d("position", String.valueOf(position));
                Toast.makeText(getApplicationContext(), ((TextView) v.findViewById(R.id.grid_item_label)).getText(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, StoreList.class);
                intent.putExtra(STORE_NO, position);
                startActivity(intent);
            }
        });

    }


}