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

public class StoreArrayAdapter extends ArrayAdapter<StoreItem> {

    private Context context;
    private List<StoreItem> storeItems;

    public StoreArrayAdapter(@NonNull Context context, int resource, List<StoreItem> storeItems) {
        super(context, resource, storeItems);
        this.context = context;
        this.storeItems = storeItems;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(this.context);
        LinearLayout itemLayout = null;

        if (convertView == null) {
            itemLayout = (LinearLayout) inflater.inflate(R.layout.listitem, null);
        } else {
            itemLayout = (LinearLayout) convertView;
        }

        StoreItem item = storeItems.get(position);

        ImageView iv = itemLayout.findViewById(R.id.iv_photo);
        iv.setImageResource(item.getImgResId());

        TextView tvPlace = itemLayout.findViewById(R.id.tv_store_name);
        tvPlace.setText(item.getStore_name());

        TextView tvDate = itemLayout.findViewById(R.id.tv_address);
        tvDate.setText(item.getAddress());

        return itemLayout;
    }

}
