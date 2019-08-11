package com.example.pragnas.dynamicfragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pragnas.R;
import com.example.pragnas.dynamicfragments.model.User;

import java.util.ArrayList;

public class FragmentOne extends Fragment {

    ListView listView;
    DisplayData populateListView;
    ArrayList<User> al_users;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentOne() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new inst
     * ance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentSecond.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentOne newInstance(String param1, String param2) {
        FragmentOne fragment = new FragmentOne();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        createList(view);
        //return inflater.inflate(R.layout.fragment_fragment_one, container, false);
        return view;

    }

    void createList(View view) {

        listView = view.findViewById(R.id.listView);

        al_users = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            User user = new User();
            user.setName("Android" + i + "");
            user.setDOB("2009");
            al_users.add(user);
        }

        populateListView = new DisplayData();
        listView.setAdapter(populateListView);
    }


    public class DisplayData extends BaseAdapter {
        LayoutInflater inflater;

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            MyViewHolder myViewHolder = null;

            if (convertView == null) {
                inflater = getLayoutInflater();
                convertView = inflater.inflate(R.layout.row_simple_listview, null);

                myViewHolder = new MyViewHolder(convertView);
                convertView.setTag(myViewHolder);
                Log.e("basadapter getView if ", "basadapter getView");

            } else {
                myViewHolder = (MyViewHolder) convertView.getTag();
                Log.e("basadapter getView else", "basadapter getView");
            }

            myViewHolder.tv.setText(al_users.get(position).getName() + "");

            return convertView;
        }

        @Override
        public Object getItem(int position) {
            return al_users.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public int getCount() {
            return al_users.size();
        }
    }

    private class MyViewHolder {
        ImageView img;
        TextView tv;

        private MyViewHolder(View view) {

            img = (ImageView) view.findViewById(R.id.img);
            tv = (TextView) view.findViewById(R.id.tv);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }
}
