package com.example.group5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class delivery_setting extends AppCompatActivity {

    TextView textView,textView1;
    private String userid = "";
    private String username = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_set);


        textView = findViewById(R.id.del_name);
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
            case R.id.btn_delivery_cus_service:
                Intent intent = new Intent(this, customer_service.class);
                startActivity(intent);
                break;

            case R.id.btn_changeIdentity:
                Intent intent0 = new Intent(this, choose_identity.class);
                startActivity(intent0);
                break;
            case R.id.btn_delLogout:
                Login.log_username = userid = username = "";
                Intent intent1 = new Intent(this, Login.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.btn_chStatus:
                Intent intent2 = new Intent(this, on_to_offstatus.class);
                startActivity(intent2);
                break;
            case R.id.del_home:
                Intent intent3 = new Intent(this, delivery_HP.class);
                startActivity(intent3);
                break;
            case R.id.del_delList:
                break;
            case R.id.del_menu:
                break;
        }
    }

}
