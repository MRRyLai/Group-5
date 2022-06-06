package com.example.group5;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class OrderArrayAdapter extends ArrayAdapter<OrderItem>{
    private Context context;
    private List<OrderItem> orderItems;

    public OrderArrayAdapter(@NonNull Context context, int resource, List<OrderItem> orderItems) {
        super(context, resource, orderItems);
        this.context = context;
        this.orderItems = orderItems;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(this.context);
        LinearLayout itemLayout = null;

        if (convertView == null) {
            itemLayout = (LinearLayout) inflater.inflate(R.layout.order_status_list, null);
        } else {
            itemLayout = (LinearLayout) convertView;
        }

        OrderItem item = orderItems.get(position);

        TextView tvOrdername = itemLayout.findViewById(R.id.tv_order_name);
        tvOrdername.setText(item.getOrder_name());

        TextView tvDate = itemLayout.findViewById(R.id.tv_status);
        tvDate.setText(item.getStatus());

        return itemLayout;
    }
}
