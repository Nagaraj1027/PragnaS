package com.example.pragnas.volleyserevercalls;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import com.example.pragnas.R;
import com.example.pragnas.volleyserevercalls.adapter.DataAdapter;
import com.example.pragnas.volleyserevercalls.model.Volley_pojo1;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class VolleyActivity extends AppCompatActivity {

    Button  buttonGet;
    ListView lv;
    ArrayList<Volley_pojo1> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley_service_example);
        initViews();
    }

    public void initViews() {

        buttonGet = (Button) findViewById(R.id.buttonGet);
        lv = (ListView) findViewById(R.id.lv);

        al = new ArrayList<>();


        buttonGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                makeServiceCallUsingVolleyToRetriveData();
            }
        });
    }


    void makeServiceCallUsingVolleyToRetriveData() {

        //Display progressbar
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Loading");
        progressDialog.show();

        JSONObject jsonObject = new JSONObject();
        try {

            //jsonObject.put("page", 2);
            Log.d("request", jsonObject.toString());

            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                    "https://reqres.in/api/users?page=2", jsonObject,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            Log.d("response is", response + "");

                            String page = "", per_page = "", total = "", total_pages = "";
                            try {


                                page = response.getString("page");
                                per_page = response.getString("per_page");
                                total = response.getString("total");
                                total_pages = response.getString("total_pages");

                                JSONArray jsonArray=response.getJSONArray("data");

                                Log.d("page", page);
                                Log.d("per_page", per_page);
                                Log.d("total", total + "");
                                Log.d("total_pages", total_pages + "");
                                Log.d("jsonArray ", jsonArray.length() + "");

                                al = new ArrayList<>();
                                if (jsonArray.length() > 0) {
                                    for (int i = 0; i <jsonArray.length(); i++) {

                                        Log.d("id ", jsonArray.getJSONObject(i).getString("id") + "");
                                        Log.d("first_name ", jsonArray.getJSONObject(i).getString("first_name") + "");
                                        Log.d("avatar ", jsonArray.getJSONObject(i).getString("last_name") + "");

                                        Volley_pojo1 volley_pojo = new Volley_pojo1();

                                        volley_pojo.setId(jsonArray.getJSONObject(i).getString("id"));
                                        volley_pojo.setFirst_name(jsonArray.getJSONObject(i).getString("first_name"));
                                        volley_pojo.setLast_name(jsonArray.getJSONObject(i).getString("last_name"));
                                        volley_pojo.setAvatar(jsonArray.getJSONObject(i).getString("avatar"));

                                        al.add(volley_pojo);
                                        Log.d("al size ", al.size() + "");
                                    }

                                    DataAdapter dataAdapter = new DataAdapter(VolleyActivity.this, al);
                                    lv.setAdapter(dataAdapter);

                                }

                                progressDialog.hide();

                            } catch (Exception e) {
                                Log.d("Exception ",  e+"");
                                progressDialog.hide();
                            }
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("something went wrong", error + "");
                    progressDialog.hide();
                }

            });


            RequestQueue requestQueue = Volley.newRequestQueue(VolleyActivity.this);
            requestQueue.getCache().clear();
            requestQueue.add(jsonObjectRequest);

        } catch (Exception e) {
            Log.e("catch block exception", e + "");
            progressDialog.hide();
        }
    }


}
