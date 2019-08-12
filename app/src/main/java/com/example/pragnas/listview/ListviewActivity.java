package com.example.pragnas.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pragnas.R;
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

        ListAdapter listAdapter = new ListAdapter();
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

    public class ListAdapter extends BaseAdapter {
        TextView tvName, tvPhone;

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View v = layoutInflater.inflate(R.layout.row_simple_listview, null);
            tvName = (TextView) v.findViewById(R.id.tvName);
            tvPhone = (TextView) v.findViewById(R.id.tvPhone);

            tvName.setText(al_users.get(position).getUserName() );
            tvPhone.setText(al_users.get(position).getUserPhone() );
            return v;
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
}
