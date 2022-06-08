package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class shop_host extends AppCompatActivity {
    TextView catch_order,business;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_host);

        catch_order = findViewById(R.id.textView2);
        business = findViewById(R.id.textView4);

        Intent it = getIntent();
        int a = it.getIntExtra("catch",0);
        int b = it.getIntExtra("business",0);


        set_catchText(a);
        set_businessText(b);
    }
    public void set_catchText(int a){

//        TextView catch_order= (TextView) findViewById(R.id.textView2);

        if(a==1){
            catch_order.setText("忙碌中");
            catch_order.setTextColor(Color.parseColor("#E30551"));
        }else if(a==2){
            catch_order.setText("正常時段");
            catch_order.setTextColor(Color.parseColor("#FFEB3B"));
        }else if(a==3){
            catch_order.setText("非巔峰時段");
            catch_order.setTextColor(Color.parseColor("#4CAF50"));
        }
    }

    public void set_businessText(int b) {
//        TextView business = (TextView) findViewById(R.id.textView4);

        if(b==4){
            business.setText("營業中");
            business.setTextColor(Color.parseColor("#4CAF50"));
        }else if(b==5){
            business.setText("非營業時間");
            business.setTextColor(Color.parseColor("#E30551"));
        }
    }
    public void goto_catch_order(View view){
        Intent it = new Intent(this,catch_order.class );
        startActivity(it);
    }

    public void goto_business(View view){
        Intent it = new Intent(this,business.class );
        startActivity(it);
    }

    public void goto_want_sell(View view){
        Intent it = new Intent(this, want_sell.class );
        startActivity(it);
    }

    public void goto_customer_service(View view){
        Intent it = new Intent(this,customer_service.class );
        startActivity(it);
    }

    public void goto_choose_identity(View view){
        Intent it = new Intent(this,choose_identity.class );
        startActivity(it);
        finish();
    }
    public void logout(View view){
        Intent it = new Intent(this,Login.class );
        startActivity(it);
        finish();
    }

}