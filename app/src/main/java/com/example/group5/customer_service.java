package com.example.group5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class customer_service extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner user_identity,event;
    String[] eventChose = {"態度不佳","商品損壞/品質不佳","訂單問題","時間問題"};
    int index1,index2;
    EditText etexplain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_service);

        etexplain = findViewById(R.id.et_explain);
        user_identity = findViewById(R.id.sp_user_identity);
        event = findViewById(R.id.sp_event);

        user_identity.setOnItemSelectedListener(customer_service.this);

    }
        public void onclick(View v){
            switch (v.getId()) { //Run Code For Major Spinner

                case R.id.btn_send: {
                    String information = "身分:" + user_identity.getSelectedItem() + "\n類型:" + event.getSelectedItem() + "\n理由:" + etexplain.getText().toString();
                    Toast.makeText(this, information, Toast.LENGTH_LONG).show();
//                    finish();
                    break;
                }
                case R.id.btn_customer_back: {
                    finish();
                    break;
                }
            }
        }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        ArrayAdapter<String> eventad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,eventChose);
        eventad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        event.setAdapter(eventad);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}