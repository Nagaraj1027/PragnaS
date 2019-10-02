package com.example.pragnas.listview.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pragnas.R;
import com.example.pragnas.listview.holder.ViewHolder;
import com.example.pragnas.listview.model.UserDetails;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    TextView tvName, tvPhone;
    ArrayList<UserDetails> al_users;
    Activity activity;


    public ListAdapter(ArrayList<UserDetails> al_users, Activity activity) {
        this.activity = activity;
        this.al_users = al_users;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            view = layoutInflater.inflate(R.layout.row_simple_listview, null);

            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tvName.setText(al_users.get(position).getUserName());
        viewHolder.tvPhone.setText(al_users.get(position).getUserPhone());
        return view;
    }

    @Override
    public int getCount() {
        return al_users.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override

    public long getItemId(int i) {
        return 0;
    }
}
