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

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {
    ListView listView;
    ArrayList al = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = (ListView) findViewById(R.id.listView);
        createArraylist();

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

    public class ListAdapter extends BaseAdapter {
        TextView tvName;

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View v = layoutInflater.inflate(R.layout.row_simple_listview, null);
            tvName = (TextView) v.findViewById(R.id.tvName);
            tvName.setText(al.get(position).toString() + position);
            return v;
        }

        @Override
        public int getCount() {
            return al.size();
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
