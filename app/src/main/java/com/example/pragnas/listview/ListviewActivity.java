package com.example.pragnas.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pragnas.R;
import com.example.pragnas.listview.adapter.ListAdapter;
import com.example.pragnas.listview.holder.ViewHolder;
import com.example.pragnas.listview.model.UserDetails;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> al = new ArrayList<>();
    ArrayList<UserDetails> al_users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = (ListView) findViewById(R.id.listView);
        createArraylist();
        createUserArraylist();

       /* ListAdapter listAdapter = new ListAdapter();
        listView.setAdapter(listAdapter);*/

        ListAdapter listAdapter = new ListAdapter(al_users, ListviewActivity.this);
        listView.setAdapter(listAdapter);
    }

    void createArraylist() {
        al.add("Hyderabad");
        al.add("Hyderabad");
        al.add("Hyderabad");
        al.add("Hyderabad");
        al.add("Hyderabad");
        al.add("Hyderabad");
        al.add("Hyderabad");
    }

    void createUserArraylist() {

        for (int i = 0; i < 5; i++) {
            UserDetails userDetails = new UserDetails();
            userDetails.setUserName("Hyderabad " + i);
            userDetails.setUserPhone("95505875406 " + i);
            al_users.add(userDetails);
        }
    }

   /* public class ListAdapter extends BaseAdapter {
        TextView tvName, tvPhone;

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                LayoutInflater layoutInflater = getLayoutInflater();
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
    }*/
}
