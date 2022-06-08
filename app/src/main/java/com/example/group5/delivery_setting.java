package com.example.group5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class delivery_setting extends AppCompatActivity {

    TextView textView,textView1;
    private String username = "";
    private String deliveryid = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_set);

        textView = findViewById(R.id.del_name);
        textView1 = findViewById(R.id.tv_deliveryid);

        if(Login.log_username!=""){//從登入端獲取用戶資料
            deliveryid = Login.log_user_id;
            username = Login.log_username;

        }else{//從註冊端獲取用戶資料
            username = Register.reg_username;

        }
        textView.setText(username);
        textView1.setText("外送編號:\n"+deliveryid);
    }

    public void onclick(View v){
        switch (v.getId()){

            case R.id.btn_changeIdentity:
                Intent intent = new Intent(this, choose_identity.class);
                startActivity(intent);
                break;
            case R.id.btn_delLogout:
                Login.log_username = Register.reg_username = username = deliveryid = "";
                Intent intent1 = new Intent(this, Login.class);
                startActivity(intent1);
                finish();
                break;
            /*
            case R.id.btn_changeStatus:
                Intent intent2 = new Intent(this, delStatus.class);
                startActivity(intent2);
                break;
            */
            case R.id.del_home:
                Intent intent3 = new Intent(this, delivery_HP.class);
                startActivity(intent3);
                break;

            case R.id.del_menu:
                break;
        }
    }

}
