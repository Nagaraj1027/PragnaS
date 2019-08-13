package com.example.pragnas.listview.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pragnas.R;

public class ViewHolder {

    public ImageView img;
    public TextView tvName;
    public TextView tvPhone;

    public ViewHolder(View view) {
        tvName = (TextView) view.findViewById(R.id.tvName);
        tvPhone = (TextView) view.findViewById(R.id.tvPhone);
        img = view.findViewById(R.id.img);
    }
}

