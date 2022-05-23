package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class KoreanStoreActivity extends AppCompatActivity {
    private Integer [] storeStar = {R.drawable.nostar, R.drawable.onestar, R.drawable.twostar, R.drawable.threestar, R.drawable.fourstar, R.drawable.fivestar};
    private Integer [] storeImg = {R.drawable.korean_store1, R.drawable.korean_store2, R.drawable.korean_store3};
    private String [] storeName = {"朴大哥的韓式炸雞", "阿里郎韓式小館", "司覓達 Seumnidak 韓式炸物"};
    private String [] storeAddress = {"台中市西屯區逢甲路20巷28弄5號", "台中市西區博館路161號", "台中市西屯區西安街209號"};
    private String [] storecomments = {""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean_store);

        ListView lvComments = findViewById(R.id.lv_comments);
        ImageView ivStoreTitle = findViewById(R.id.iv_store_title);
        TextView tvStoreTitle = findViewById(R.id.tv_store_title);

        Intent intent = this.getIntent();
        int storeNo = intent.getIntExtra(StoreList.STORE_NO, 0);
        ivStoreTitle.setImageResource(storeImg[storeNo]);
        tvStoreTitle.setText(storeName[storeNo]);

    }
    public void Onclick(View view){
        switch(view.getId()){
            case R.id.btn_cancel:
                finish();
                break;
            case R.id.btn_add:
//將點選的食物加入購物車
                Toast.makeText(getApplicationContext(), "成功加入購物車", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }

    }
}