package com.example.pragnas.volleyserevercalls.adapter;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.pragnas.R;
import com.example.pragnas.volleyserevercalls.model.Volley_pojo1;


import java.util.ArrayList;

/**
 * Created by nagaraj on 19/08/2019.
 */

public class DataAdapter extends BaseAdapter {

    private Activity context;
    private ArrayList<Volley_pojo1> al;

    public DataAdapter(Activity context, ArrayList<Volley_pojo1> al) {
        super();
        this.context = context;
        this.al = al;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.volley_row_layout, null, true);

        Log.d("al.size()", al.size() + "");

        TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        TextView tvFirstName = (TextView) listViewItem.findViewById(R.id.tvFirstName);
        TextView tyvLastName = (TextView) listViewItem.findViewById(R.id.tyvLastName);
        ImageView img = (ImageView) listViewItem.findViewById(R.id.img);

        textViewId.setText(al.get(position).getId());
        tvFirstName.setText(al.get(position).getFirst_name());
        tyvLastName.setText(al.get(position).getLast_name());


        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.avatarupload)
                .error(R.drawable.avatarupload);

        //.centerCrop()
        //.diskCacheStrategy(DiskCacheStrategy.ALL)
        //.priority(Priority.HIGH);

        Glide.with(context).load(al.get(position).getAvatar())
                .apply(options)
                .into(img);




        return listViewItem;
    }
}