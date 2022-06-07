package com.example.group5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    private final String[] mobileValues;

    public ImageAdapter(Context context, String[] mobileValues) {
        this.context = context;
        this.mobileValues = mobileValues;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.text_with_image_in_list, null);

            // set value into textview
            TextView textView = (TextView) gridView
                    .findViewById(R.id.grid_item_label);
            textView.setText(mobileValues[position]);

            // set image based on selected text
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.grid_item_image);

            String mobile = mobileValues[position];

            if (mobile.equals("飲料專區")) {
                imageView.setImageResource(R.drawable.food_drinks);
            } else if (mobile.equals("炸物專區")) {
                imageView.setImageResource(R.drawable.food_fries);
            } else if (mobile.equals("日式料理")) {
                imageView.setImageResource(R.drawable.food_japanese);
            }
            else if (mobile.equals("台灣小吃")) {
                imageView.setImageResource(R.drawable.food_taiwanese_snake);
            }
            else if (mobile.equals("韓式料理")) {
                imageView.setImageResource(R.drawable.food_korean);
            }
            else if (mobile.equals("冰品專區")) {
                imageView.setImageResource(R.drawable.food_ice_cream);
            }
            else if (mobile.equals("義式料理")) {
                imageView.setImageResource(R.drawable.food_italy);
            }
            else if (mobile.equals("泰式料理")) {
                imageView.setImageResource(R.drawable.food_thai);
            }else {
//                imageView.setImageResource(R.drawable.android_logo);
            }

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        return mobileValues.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
