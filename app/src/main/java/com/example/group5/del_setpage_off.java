package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class del_setpage_off extends AppCompatActivity {

    TextView textView,textView1;
    private String userid = "";
    private String username = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del_setpage_off);

        textView = findViewById(R.id.del_name_off);
        textView1 = findViewById(R.id.del_codeNum);
        if(Login.log_username!=""){
            username = Login.log_username;
            userid = Login.log_userid;
        }else{
            username = Register.reg_username;
            Register.reg_username = "";
        }
        textView.setText(username);
        textView1.setText(userid);

    }

    public void onclick(View v){
        switch (v.getId()){
            case R.id.btn_delivery_cus_device1:
                Intent intent = new Intent(this, customer_service.class);
                startActivity(intent);
                break;

            case R.id.btn_changeIdentity_off:
                Intent intent0 = new Intent(this, choose_identity.class);
                startActivity(intent0);
                break;
            case R.id.btn_delLogout_off:
                Login.log_username = userid = username = "";
                Intent intent1 = new Intent(this, Login.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.btn_chStatus_off:
                Intent intent2 = new Intent(this, offToOnstatus.class);
                startActivity(intent2);
                break;

            case R.id.del_home_off:
                Toast.makeText(del_setpage_off.this, "打卡上班才可查看可接取訂單", Toast.LENGTH_SHORT).show();
                break;
            case R.id.del_delList_off:
                Toast.makeText(del_setpage_off.this, "打卡上班才可查看接取訂單", Toast.LENGTH_SHORT).show();
                break;
            case R.id.del_menu_off:
                break;
        }
    }
}