package com.example.pragnas.retrofit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import com.example.pragnas.R
import com.example.pragnas.retrofit.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {
    val BASE_URL = "https://api.github.com/search/"
    var tv: TextView? = null
    var str:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
        tv = findViewById(R.id.tv)
        Log.e("Hello ","Hello1")
        getUsers()
    }


    fun getUsers() {

        var retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        var api = retrofit.create(Api::class.java)


        var call = api.users


        call.enqueue(object : Callback<UsersList> {

            override fun onResponse(call: Call<UsersList>?, response: Response<UsersList>?) {
                var usres = response?.body()
                var user = usres?.users
                var length = user!!.size

                for (i in 0 until length) {
                    str = str + "\n" + user.get(i).id + " " + user.get(i).login
                }

                tv!!.text = str
            }

            override fun onFailure(call: Call<UsersList>?, t: Throwable?) {
                Log.v("Error", t.toString())
            }
        })
    }
}
