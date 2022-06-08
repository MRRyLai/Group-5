package com.example.group5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class orderlistAdapter extends BaseAdapter {

    Context context;
    String orderlist[];
    int orderImages[];
    LayoutInflater inflater;

    public orderlistAdapter(Context ctx, String [] listorder, int[] images){
        this.context = ctx;
        this.orderlist = listorder;
        this.orderImages = images;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return orderlist.length;
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
        convertView = inflater.inflate(R.layout.activity_order_listview, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.ordername1);
        ImageView fruitImg = (ImageView)convertView.findViewById(R.id.listimageIcon);
        txtView.setText(orderlist[position]);
        fruitImg.setImageResource(orderImages[position]);

        return convertView;
    }
}
