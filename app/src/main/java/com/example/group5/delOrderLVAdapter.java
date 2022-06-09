package com.example.group5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class delOrderLVAdapter extends BaseAdapter {

    Context context;
    String foodlist[];
    String amountlist[];
    LayoutInflater inflater;

    public delOrderLVAdapter(Context ctx, String [] listfood, String[] listamount){
        this.context = ctx;
        this.foodlist = listfood;
        this.amountlist = listamount;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return foodlist.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_del_order_lv, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.foodname);
        TextView fruitImg = (TextView)convertView.findViewById(R.id.amount);
        txtView.setText(foodlist[position]);
        txtView.setText(amountlist[position]);

        return convertView;
    }
}
