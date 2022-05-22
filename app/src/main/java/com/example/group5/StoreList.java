package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class StoreList extends AppCompatActivity {
    public static final String STORE_NO = "store_no";
    private Integer[] storeImg = {R.drawable.korean_store1, R.drawable.korean_store2, R.drawable.korean_store3};
    private String [] storeName = {"朴大哥的韓式炸雞", "阿里郎韓式小館", "司覓達 Seumnidak 韓式炸物"};
    private String [] storeAddress = {"台中市西屯區逢甲路20巷28弄5號", "台中市西區博館路161號", "台中市西屯區西安街209號"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_list);
//
//        Intent intent = this.getIntent();
//        int albumNo = intent.getIntExtra(MainActivity.STORE_NO, 0);




        ListView lvKoreanStore = this.findViewById(R.id.lv_korean_store);

        ArrayList<StoreItem> storeList = new ArrayList<StoreItem>();
        for(int i=0;i< storeName.length;i++){
            storeList.add(new StoreItem(storeImg[i],storeName[i], storeAddress[i]));
        }


        StoreArrayAdapter adapter = new StoreArrayAdapter(StoreList.this, R.layout.listitem, storeList);

        lvKoreanStore.setAdapter(adapter);

        lvKoreanStore.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.v("saokfasopdkf", String.valueOf(position));

                Intent intent = new Intent();
                intent.setClass(StoreList.this, KoreanStoreActivity.class);
                intent.putExtra(STORE_NO, position);
                startActivity(intent);

            }
        });

    }

}