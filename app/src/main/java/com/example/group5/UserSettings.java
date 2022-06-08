package com.example.group5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URL;

public class UserSettings extends AppCompatActivity {
    TextView textView;
    private String username = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);

        textView = findViewById(R.id.tv_user_name);
        if(Login.log_username!=""){
            username = Login.log_username;

        }else{
            username = Register.reg_username;
            Register.reg_username = "";
        }
        textView.setText(username);
    }

    public void onclick(View v){
        switch (v.getId()){

            case R.id.btn_choose_identity:
                Intent intent = new Intent(this, choose_identity.class);
                startActivity(intent);
                break;
            case R.id.btn_logout:
                username = "";
                Intent intent1 = new Intent(this, Login.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.btn_usersetting_back:
                finish();
                break;
        }
    }
}