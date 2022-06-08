package com.example.group5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class delivery_setting extends AppCompatActivity {

    TextView textView;
    CompoundButton switchButton;
    ImageView imageViewLight;

    private String username = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_set);

        switchButton = findViewById(R.id.sw_workstaCH);
        imageViewLight = findViewById(R.id.worklight);

        textView = findViewById(R.id.del_name);
        if(Login.log_username!=""){
            username = Login.log_username;
            Login.log_username = "";
        }else{
            username = Register.reg_username;
            Register.reg_username = "";
        }
        textView.setText(username);



        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    imageViewLight.setImageResource(R.drawable.greenlight);
                }else{
                    imageViewLight.setImageResource(R.drawable.redlight);
                }
            }
        });



    }

    public void onclick(View v){
        switch (v.getId()){


            case R.id.btn_changeIdentity:
                Intent intent = new Intent(this, choose_identity.class);
                startActivity(intent);
                break;
            case R.id.btn_delLogout:
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
